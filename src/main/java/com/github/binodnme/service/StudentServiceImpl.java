package com.github.binodnme.service;

import com.github.binodnme.dao.StudentDAO;
import com.github.binodnme.entity.Student;
import com.github.binodnme.enums.PCUnitName;
import com.github.binodnme.factory.EntityManagerFactory;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * @author Binod Shrestha <binodshrestha@lfetchnology.com> on 11/22/2016.
 */
@Stateless
public class StudentServiceImpl implements StudentService {

    @Inject
    StudentDAO studentDAO;

    @Inject
    EntityManagerFactory entityManagerFactory;

    @Override
    public String testMethod() {
        return "hello world";
    }

    @Override
    public Student save(Student student) {
        return studentDAO.save(student, getEntityManger(student));
    }

    private EntityManager getEntityManger(Student student) {
        if (student.getFirstName().startsWith("a")) {
            return entityManagerFactory.createEntityManger(PCUnitName.DB1);
        } else {
            return entityManagerFactory.createEntityManger(PCUnitName.DB2);
        }
    }
}