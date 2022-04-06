package com.example.demo;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("/ex1{vel}")
@Singleton
public class HelloController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Double sayHello(@PathParam("vel") Double vel) {
        System.out.println("Convertendo velocidade de nós para km/h");

        return vel*1.852;
    }
}
