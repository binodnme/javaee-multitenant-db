package com.github.binodnme.factory;

import com.github.binodnme.enums.PCUnitName;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 3/11/17.
 */
public class EntityManagerFactory {

    @PersistenceContext(unitName = "db1")
    private EntityManager emDb1;

    @PersistenceContext(unitName = "db2")
    private EntityManager emDb2;

    public EntityManager createEntityManger(PCUnitName name) {
        switch (name) {
            case DB1:
                return emDb1;
            case DB2:
                return emDb2;
            default:
                throw new RuntimeException("unknown persistance context unit name");
        }
    }
}