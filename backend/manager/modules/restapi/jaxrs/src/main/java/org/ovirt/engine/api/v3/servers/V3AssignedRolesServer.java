/*
 * Copyright oVirt Authors
 * SPDX-License-Identifier: Apache-2.0
*/

package org.ovirt.engine.api.v3.servers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.ovirt.engine.api.resource.AssignedRolesResource;
import org.ovirt.engine.api.v3.V3Server;
import org.ovirt.engine.api.v3.types.V3Roles;

@Produces({"application/xml", "application/json"})
public class V3AssignedRolesServer extends V3Server<AssignedRolesResource> {
    public V3AssignedRolesServer(AssignedRolesResource delegate) {
        super(delegate);
    }

    @GET
    public V3Roles list() {
        return adaptList(getDelegate()::list);
    }

    @Path("{id}")
    public V3RoleServer getRoleResource(@PathParam("id") String id) {
        return new V3RoleServer(getDelegate().getRoleResource(id));
    }
}
