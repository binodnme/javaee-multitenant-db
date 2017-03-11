package com.github.binodnme.rs;

import com.github.binodnme.annotation.TenantEM;
import com.github.binodnme.entity.Student;
import com.github.binodnme.enums.PCUnitName;
import com.github.binodnme.factory.EntityManagerFactory;
import com.github.binodnme.service.StudentService;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
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

    @Inject
    EntityManagerFactory entityManagerFactory;

    @Inject
    @TenantEM
    Event<EntityManager> tenantBaseEM;

    @Path("/")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(@Valid Student student) {
        fireEntityManger(student);
        return Response.status(Response.Status.CREATED).entity(studentService.save(student)).build();
    }


    //handle this in authentication filter
    private void fireEntityManger(Student student) {
        EntityManager entityManager;
        if (student.getFirstName().startsWith("x")) {
            entityManager = entityManagerFactory.createEntityManger(PCUnitName.DB1);
        } else {
            entityManager = entityManagerFactory.createEntityManger(PCUnitName.DB2);
        }
        tenantBaseEM.fire(entityManager);
    }
}
