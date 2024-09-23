package com.ai4everyone.tutorial.springcontext;

import com.ai4everyone.tutorial.springcontext.model.Customer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationTest.class);
    private static ApplicationContext context;

    @BeforeAll
    static void setup() {
        LOGGER.info("Setting test environment");
        LOGGER.info("Initializing context");
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    void whenCustomerCreatedBySpringContext_thenCustomerPropertiesMustHaveDefaultValue() {
        LOGGER.info("ApplicationTest#whenCustomerCreatedBySpringContext_thenCustomerPropertiesMustHaveDefaultValue");
        Customer customer = context.getBean("customer", Customer.class);
        assertAll(
                () -> assertEquals("Ali", customer.getName()),
                () -> assertEquals("Mohammadi", customer.getFamily()),
                () -> assertEquals(30, customer.getAge())
        );
    }
}