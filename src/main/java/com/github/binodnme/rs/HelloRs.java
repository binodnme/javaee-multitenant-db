package com.github.binodnme.rs;

import com.github.binodnme.service.StudentService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Binod Shrestha <binodshrestha@lfetchnology.com> on 11/10/2016.
 */
@Path("/")
public class HelloRs {
    @Inject
    StudentService testService;

    @Path("/")
    @GET
    public String helloWorld(){
        return testService.testMethod();
    }

}
