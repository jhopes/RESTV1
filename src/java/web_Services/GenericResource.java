/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_Services;

import Modell.Producto;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author joel.perez
 */
@Path("/operacion")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of web_Services.GenericResource
     * @return an instance of java.lang.String
     */
    //URL: http://localhost:8080/App_restv2_server/web/operacion/get
    @GET //insertar
    @Path("/get")
    @Produces("application/json")
    public Producto getJson() {
        Producto p = new Producto();
        p.setDescription("lll");
        p.setName("lllllllllll");
        p.setId("001");
        p.setPrice("2.0");
        return p;
    }
    //URL: http://localhost:8080/App_restv2_server/web/operacion/post
    @POST
    @Path("/post")
    @Consumes("application/json")
    public Response postJson(Producto p){
        p.setDescription("lll");
        p.setName("lllllllllll");
        p.setId("001");
        p.setPrice("2.0");
        String result= "Product create: "+p;
        return  Response.status(201).entity(result).build();
    }
}
