package com.github.binodnme.service;

import com.github.binodnme.dao.StudentDAO;
import com.github.binodnme.entity.Student;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * @author Binod Shrestha <binodshrestha@lfetchnology.com> on 11/22/2016.
 */
@Stateless
public class StudentServiceImpl implements StudentService {

    @Inject
    StudentDAO studentDAO;

    @Override
    public Student save(Student student) {
        return studentDAO.save(student);
    }
}