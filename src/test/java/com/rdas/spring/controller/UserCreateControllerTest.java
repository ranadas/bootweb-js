package com.rdas.spring.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.annotation.DirtiesContext;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by rdas on 23/07/2016.
 */
//@RunWith(MockitoJUnitRunner.class)
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//@DirtiesContext
public class UserCreateControllerTest {


    private UserCreateController userCreateController;

    @Before
    public void setup() {
        userCreateController = new UserCreateController();
    }

    @Test
    public void testBasicControllerCall() {
        assertThat(userCreateController).isNotNull();
    }
}
