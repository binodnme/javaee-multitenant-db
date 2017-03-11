package com.github.binodnme.dao;

import javax.persistence.EntityManager;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 3/11/17.
 */
public interface BaseDAO<T> {
    T save(T entity, EntityManager em);
}
