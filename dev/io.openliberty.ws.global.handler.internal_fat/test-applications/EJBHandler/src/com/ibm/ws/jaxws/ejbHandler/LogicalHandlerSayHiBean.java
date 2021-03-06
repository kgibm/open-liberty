/*******************************************************************************
 * Copyright (c) 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.jaxws.ejbHandler;

import javax.ejb.Stateless;

@Stateless
public class LogicalHandlerSayHiBean implements LogicalHandlerSayHi {
    /* (non-Javadoc)
     * @see com.ibm.ws.jaxws.ejbHandler.LogicalHandlerSayHi#sayHi(java.lang.String)
     */
    @Override
    public String sayHi(String name) {
        return "Hi, " + name;
    }
}
