package com.github.binodnme.producer;

import com.github.binodnme.annotation.TenantEM;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 3/11/17.
 */
@RequestScoped
public class TenantEMProducer {
    @Produces
    @RequestScoped
    @TenantEM
    private EntityManager em;

    public void handleEntityManagerEvent(@Observes @TenantEM EntityManager em) {
        this.em = em;
    }
}
