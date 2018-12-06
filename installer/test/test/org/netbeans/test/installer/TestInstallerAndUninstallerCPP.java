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

package org.netbeans.test.installer;

import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.netbeans.junit.NbTestCase;
import org.netbeans.junit.NbTestSuite;

/**
 *
 * @author Mikhail Vaysman
 */
public class TestInstallerAndUninstallerCPP extends Installer {

    /*
    public TestInstallerAndUninstallerCPP() {
        super("Installer test");
    }

    public static Test suite() {
        TestSuite suite = new NbTestSuite(TestInstallerAndUninstallerCPP.class);

        return suite;
    }
    */

    public void testInstaller() {
        TestData data = new TestData(Logger.getLogger("global"));

        Utils.phaseOne(data, "cpp");

        // Pages
        // Welcome
        Utils.stepWelcome();
        // Agreement
        Utils.stepLicense();
        // Location
        Utils.stepSetDir(
            data,
            "Install the NetBeans IDE",
            data.GetNetBeansInstallPath( )
          );
        // Summary
        Utils.stepInstall(data);
        //Installation
        //finish
        Utils.stepFinish();


        //Utils.phaseTwo(data);

        Utils.phaseFour(data);

        Utils.phaseFive( data );

        //TODO Dir removed test
        //TODO Clean up work dir
    }

    //public static void main(String[] args) {
    //    junit.textui.TestRunner.run(suite());
    //}
}
