package com.github.binodnme;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Pratish Shrestha <pratishshrestha@lftechnology.com>
 */
public class Resources {

    @PersistenceContext(unitName = "db1")
    private EntityManager emDb1;
}
