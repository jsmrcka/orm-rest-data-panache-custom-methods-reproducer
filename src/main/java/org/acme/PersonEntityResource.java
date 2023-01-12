package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "/entity")
public interface PersonEntityResource extends PanacheEntityResource<Person, Long> {
    @GET
    @Path("/customGet")
    default void customGet() {
    }
}
