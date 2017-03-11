package com.github.binodnme.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 2/16/17.
 */
public class TestServiceImplTest {

    StudentServiceImpl testService;

    @Before
    public void setup() {
        testService = new StudentServiceImpl();
    }

    @Test
    public void shouldReturnHelloWorld_testMethod() throws Exception {
        assertThat(testService.testMethod(), is("hello world"));
    }


}