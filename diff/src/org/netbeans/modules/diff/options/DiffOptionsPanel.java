/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.diff.options;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.*;
import org.netbeans.api.options.OptionsDisplayer;
import org.netbeans.modules.diff.DiffModuleConfig;
import org.netbeans.spi.options.OptionsPanelController;

/**
 * Diff Options panel.
 *
 * @author  Maros Sandor
 */
@OptionsPanelController.Keywords(keywords={"diff"}, location=OptionsDisplayer.ADVANCED, tabTitle="Diff")
class DiffOptionsPanel extends javax.swing.JPanel implements ActionListener, DocumentListener {

    private boolean isChanged;
    
    /** Creates new form DiffOptionsPanel */
    public DiffOptionsPanel() {
        initComponents();
        ignoreWhitespace.addActionListener(this);
        ignoreAllWhitespace.addActionListener(this);
        ignoreCase.addActionListener(this);
    }

    public JCheckBox getIgnoreWhitespace() {
        return ignoreWhitespace;
    }

    public JCheckBox getIgnoreInnerWhitespace() {
        return ignoreAllWhitespace;
    }

    public JCheckBox getIgnoreCase() {
        return ignoreCase;
    }

    public void setChanged(boolean changed) {
        isChanged = changed;
    }

    public boolean isChanged() {
        return isChanged;
    }    
    
    private void fireChanged() {
        if(ignoreWhitespace.isSelected() != DiffModuleConfig.getDefault().getOptions().ignoreLeadingAndtrailingWhitespace) {
            isChanged = true;
            return;
        }
        if(ignoreAllWhitespace.isSelected() != DiffModuleConfig.getDefault().getOptions().ignoreInnerWhitespace) {
            isChanged = true;
            return;
        }
        if(ignoreCase.isSelected() != DiffModuleConfig.getDefault().getOptions().ignoreCase) {
            isChanged = true;
            return;
        }
        isChanged = false;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ignoreWhitespace = new javax.swing.JCheckBox();
        ignoreAllWhitespace = new javax.swing.JCheckBox();
        ignoreCase = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 0, 0, 5));

        org.openide.awt.Mnemonics.setLocalizedText(ignoreWhitespace, org.openide.util.NbBundle.getMessage(DiffOptionsPanel.class, "jCheckBox1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(ignoreAllWhitespace, org.openide.util.NbBundle.getMessage(DiffOptionsPanel.class, "DiffOptionsPanel.ignoreAllWhitespace.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(ignoreCase, org.openide.util.NbBundle.getMessage(DiffOptionsPanel.class, "DiffOptionsPanel.ignoreCase.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ignoreWhitespace)
                    .addComponent(ignoreAllWhitespace)
                    .addComponent(ignoreCase))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ignoreWhitespace)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ignoreAllWhitespace)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ignoreCase))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ignoreAllWhitespace;
    private javax.swing.JCheckBox ignoreCase;
    private javax.swing.JCheckBox ignoreWhitespace;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed (ActionEvent e) {
        fireChanged();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        fireChanged();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        fireChanged();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        fireChanged();
    }
    
}