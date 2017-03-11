package com.github.binodnme.rs;

import com.github.binodnme.entity.Student;
import com.github.binodnme.service.StudentService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 3/11/17.
 */
@Path("/student")
public class StudentRs {

    @Inject
    StudentService studentService;

    @Path("/")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(@Valid Student student) {
        return Response.status(Response.Status.CREATED).entity(studentService.save(student)).build();
    }
}
