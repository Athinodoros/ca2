/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import entity.Person;
import facade.JSONconverter;
import facade.PersonFacade;
import javax.persistence.Persistence;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.server.JSONP;

/**
 * REST Web Service
 *
 * @author Athinodoros
 */
@Path("person")
public class apiResource {
    PersonFacade facade = new PersonFacade(Persistence.createEntityManagerFactory("CA2TEST"));
    Gson gson = new Gson();
    
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
    public String getPerson(@PathParam ("id") Long perid) {
        //TODO return proper representation object
        return  gson.toJson(facade.getPerson(perid), Person.class);
    }

    /**
     * PUT method for updating or creating an instance of apiResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/json")
    public String postPerson(String content) {
        
        return JSONconverter.getJSONFromPerson(facade.createPerson(JSONconverter.getPersonFromJSON(content)));
        //return   content;
    }
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/json")
    public String putPerson(String content) {
        
        return JSONconverter.getJSONFromPerson(facade.updatePerson(JSONconverter.getPersonFromJSON(content)));
        //return   content;
    }
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("application/json")
    public String deletePerson(String content) {
        
        return JSONconverter.getJSONFromPerson(facade.deletePerson(JSONconverter.getPersonFromJSON(content)));
        //return   content;
    }
}
