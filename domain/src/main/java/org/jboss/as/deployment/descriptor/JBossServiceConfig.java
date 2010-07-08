/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.deployment.descriptor;

/**
 * Configuration for a service coming from a JBoss service XML definition.
 *
 * @author John E. Bailey
 */
public class JBossServiceConfig {
    private String name;
    private String code;
    private String interfaceName;
    private String xmbeanDD;
    private String xmbeanCode;

    private JBossServiceConstructorConfig constructorConfig;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getXmbeanDD() {
        return xmbeanDD;
    }

    public void setXmbeanDD(String xmbeanDD) {
        this.xmbeanDD = xmbeanDD;
    }

    public String getXmbeanCode() {
        return xmbeanCode;
    }

    public void setXmbeanCode(String xmbeanCode) {
        this.xmbeanCode = xmbeanCode;
    }

    public JBossServiceConstructorConfig getConstructorConfig() {
        return constructorConfig;
    }

    public void setConstructorConfig(JBossServiceConstructorConfig constructorConfig) {
        this.constructorConfig = constructorConfig;
    }
}
