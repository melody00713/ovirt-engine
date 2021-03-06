/*
 * Copyright oVirt Authors
 * SPDX-License-Identifier: Apache-2.0
*/

package org.ovirt.engine.api.v3.adapters;

import static org.ovirt.engine.api.v3.adapters.V3InAdapters.adaptIn;

import org.ovirt.engine.api.model.OpenStackNetworkProviders;
import org.ovirt.engine.api.v3.V3Adapter;
import org.ovirt.engine.api.v3.types.V3OpenStackNetworkProviders;

public class V3OpenStackNetworkProvidersInAdapter implements V3Adapter<V3OpenStackNetworkProviders, OpenStackNetworkProviders> {
    @Override
    public OpenStackNetworkProviders adapt(V3OpenStackNetworkProviders from) {
        OpenStackNetworkProviders to = new OpenStackNetworkProviders();
        if (from.isSetActions()) {
            to.setActions(adaptIn(from.getActions()));
        }
        if (from.isSetActive()) {
            to.setActive(from.getActive());
        }
        if (from.isSetSize()) {
            to.setSize(from.getSize());
        }
        if (from.isSetTotal()) {
            to.setTotal(from.getTotal());
        }
        to.getOpenStackNetworkProviders().addAll(adaptIn(from.getOpenStackNetworkProviders()));
        return to;
    }
}
