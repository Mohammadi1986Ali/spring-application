package com.ai4everyone.tutorial.springiocconstructor;

import com.ai4everyone.tutorial.springiocconstructor.service.GeneralServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ApplicationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationTest.class);
    static ApplicationContext context;

    @BeforeAll
    static void setup() {
        LOGGER.info("Setting test environment");
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    void whenGeneralServiceObjectCreatedBySpringContext_thenGeneralServiceObjectMustBeCreated() {
        LOGGER.info("ApplicationTest#whenGeneralServiceObjectCreatedBySpringContext_thenGeneralServiceObjectMustBeCreated");
        var generalService = context.getBean("generalService", GeneralServiceImpl.class);
        assertNotNull(generalService.getService());
    }
}