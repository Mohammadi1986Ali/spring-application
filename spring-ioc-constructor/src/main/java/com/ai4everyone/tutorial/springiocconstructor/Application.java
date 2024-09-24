package com.ai4everyone.tutorial.springiocconstructor;

import com.ai4everyone.tutorial.springiocconstructor.service.GeneralServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
    private static ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String[] args) {
        LOGGER.info("Application#main");

        GeneralServiceImpl generalService = context.getBean("generalService", GeneralServiceImpl.class);
        generalService.getService().welcomeCustomer("Ali");
        context.close();
    }
}
