package com.github.binodnme.dao;

import javax.persistence.EntityManager;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 3/11/17.
 */
public class BaseDAOImpl<T> implements BaseDAO<T> {

    @Override
    public T save(T entity, EntityManager em) {
        em.persist(entity);
        em.flush();
        return entity;
    }
}