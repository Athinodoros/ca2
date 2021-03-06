/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import entity.Person;
import facade.CompanyFacade;
import facade.JSONconverter;
import facade.PersonFacade;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author Athinodoros
 */
@Path("api")
public class apiResourceCompany {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of apiResourceCompany
     */
    public apiResourceCompany() {
    }
    
    CompanyFacade facade = new CompanyFacade(Persistence.createEntityManagerFactory(deploy.DeploymentConfiguration.PU_NAME));
    Gson gson = new Gson();
    /**
     * Retrieves representation of an instance of rest.apiResourceCompany
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{id}")
    @Produces("application/json")
    public String getCompany(@PathParam("id") Long perid) {
        //TODO return proper representation object
        return gson.toJson(facade.getCompany(perid), Person.class);
    }
    @GET
    @Path("all")
    @Produces("application/json")
    public String getCompanies(@PathParam("id") Long perid) {
        //TODO return proper representation object
        return gson.toJson(facade.getCompanies());
    }

    /**
     * PUT method for updating or creating an instance of apiResourcePerson
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String postCompany(String content) {

        return JSONconverter.getJSONFromCompany(facade.createCompany(JSONconverter.getCompanyFromJSON(content)));
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public String putCompany(String content) {

        return JSONconverter.getJSONFromCompany(facade.updateCompany(JSONconverter.getCompanyFromJSON(content)));
    }

    @DELETE
    @Consumes("application/json")
    @Produces("application/json")
    public String deleteCompany(String content) {

        return JSONconverter.getJSONFromCompany(facade.deleteCompany(JSONconverter.getCompanyFromJSON(content)));
    }
}
