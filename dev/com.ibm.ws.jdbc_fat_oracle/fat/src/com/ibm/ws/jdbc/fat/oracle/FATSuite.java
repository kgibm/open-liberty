/*******************************************************************************
 * Copyright (c) 2016, 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.jdbc.fat.oracle;

import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.testcontainers.containers.OracleContainer;

import componenttest.topology.utils.ExternalTestServiceDockerClientStrategy;

@RunWith(Suite.class)
@SuiteClasses({
                OracleTest.class,
                OracleUCPTest.class
})
public class FATSuite {
	
    //TODO replace this container with the official oracle-xe container if/when it is available without a license
    @ClassRule
    public static OracleContainer oracle = new OracleContainer("oracleinanutshell/oracle-xe-11g");
    
    static {
        ExternalTestServiceDockerClientStrategy.clearTestcontainersConfig();
    }
}