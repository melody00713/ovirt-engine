/*
 * Copyright oVirt Authors
 * SPDX-License-Identifier: Apache-2.0
*/

package org.ovirt.engine.api.v3.adapters;

import static org.ovirt.engine.api.v3.adapters.V3OutAdapters.adaptOut;

import org.ovirt.engine.api.model.HostDevices;
import org.ovirt.engine.api.v3.V3Adapter;
import org.ovirt.engine.api.v3.types.V3HostDevices;

public class V3HostDevicesOutAdapter implements V3Adapter<HostDevices, V3HostDevices> {
    @Override
    public V3HostDevices adapt(HostDevices from) {
        V3HostDevices to = new V3HostDevices();
        if (from.isSetActions()) {
            to.setActions(adaptOut(from.getActions()));
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
        to.getHostDevices().addAll(adaptOut(from.getHostDevices()));
        return to;
    }
}
