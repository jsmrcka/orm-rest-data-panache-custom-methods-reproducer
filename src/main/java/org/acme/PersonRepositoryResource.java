package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "/repository")
public interface PersonRepositoryResource extends PanacheRepositoryResource<PersonRepository, Person, Long> {
    @GET
    @Path("/customGet")
    default void customGet() {
    }
}
