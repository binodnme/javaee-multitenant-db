package com.github.binodnme.dao;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 3/11/17.
 */
public interface BaseDAO<T> {
    T save(T entity);
}