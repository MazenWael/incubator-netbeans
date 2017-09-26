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

package org.netbeans.modules.java.hints;
import java.util.prefs.Preferences;

/**
 * Options Customiser panel for {@link FieldForUnusedParam} hint
 * @author Sam Halliday
 */
public class FieldForUnusedParamCustomizer extends javax.swing.JPanel {

    private Preferences p;

    /** Creates new form LocalVariableFixCustomizer */
    public FieldForUnusedParamCustomizer(Preferences p) {
        initComponents();
        this.p = p;
        finalFields.setSelected(FieldForUnusedParam.isFinalFields(p));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        finalFields = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(finalFields, org.openide.util.NbBundle.getBundle(FieldForUnusedParamCustomizer.class).getString("FieldForUnusedParamCustomizer.finalFields.text")); // NOI18N
        finalFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalFieldsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(finalFields, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(finalFields)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        finalFields.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FieldForUnusedParamCustomizer.class, "ACSD_Final_Fields")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void finalFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalFieldsActionPerformed
        FieldForUnusedParam.setFinalFields(p, finalFields.isSelected());
}//GEN-LAST:event_finalFieldsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox finalFields;
    // End of variables declaration//GEN-END:variables
}