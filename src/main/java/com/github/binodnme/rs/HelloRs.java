package com.github.binodnme.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Binod Shrestha <binodshrestha@lfetchnology.com> on 11/10/2016.
 */
@Path("/")
public class HelloRs {

    @Path("/")
    @GET
    public String helloWorld(){
        return "hello world";
    }

}
