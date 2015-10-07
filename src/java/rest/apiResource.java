/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author Athinodoros
 */
@Path("person")
public class apiResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of apiResource
     */
    public apiResource() {
    }

    /**
     * Retrieves representation of an instance of rest.apiResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{id}")
    @Produces("application/json")
    public String getPerson(@PathParam ("id") Integer id) {
        //TODO return proper representation object
        return "{'id':'1'}";
    }

    /**
     * PUT method for updating or creating an instance of apiResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
