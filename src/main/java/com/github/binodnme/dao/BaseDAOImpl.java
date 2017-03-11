package com.github.binodnme.dao;

import com.github.binodnme.annotation.TenantEM;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 3/11/17.
 */
public class BaseDAOImpl<T> implements BaseDAO<T> {

    @Inject
    @TenantEM
    EntityManager em;

    @Override
    public T save(T entity) {
        em.persist(entity);
        em.flush();
        return entity;
    }
}