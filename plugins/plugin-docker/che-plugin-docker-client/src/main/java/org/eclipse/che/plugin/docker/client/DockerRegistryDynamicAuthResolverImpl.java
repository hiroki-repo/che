/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.plugin.docker.client;

import org.eclipse.che.plugin.docker.client.dto.AuthConfig;

import java.util.Map;

/**
 * @author Mykola Morhun
 */
public class DockerRegistryDynamicAuthResolverImpl implements  DockerRegistryDynamicAuthResolver {
    // we haven't supported registries with dynamic password yet
    @Override
    public AuthConfig getDynamicXRegistryAuth(String registry) {
        return null;
    }

    @Override
    public Map<String, AuthConfig> getDynamicXRegistryConfig() {
        return null;
    }
}
