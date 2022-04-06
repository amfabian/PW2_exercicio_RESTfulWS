package com.example.demo;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("/ex1")
@Singleton
public class Exercicio1 {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String convMilhas(@FormParam("vel") double vel) {
        System.out.println("Convertendo velocidade de nós para km/h");
        double i = vel*0.621371;
        String string =  Double.toString(i);
        return string;
    }
}
