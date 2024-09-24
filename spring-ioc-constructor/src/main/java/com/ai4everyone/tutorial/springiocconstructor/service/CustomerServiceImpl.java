package com.ai4everyone.tutorial.springiocconstructor.service;

import com.ai4everyone.tutorial.springiocconstructor.api.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerServiceImpl implements CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

    public CustomerServiceImpl() {
        LOGGER.info("CustomerServiceImpl#CustomerServiceImpl");
    }

    @Override
    public void welcomeCustomer(String customerName) {
        LOGGER.info("CustomerServiceImpl#welcomeCustomer");
        LOGGER.info("Welcome {}", customerName);
    }

    public void beanInitMethod() {
        LOGGER.info("CustomerServiceImpl#beanInitMethod");
    }

    public void beanDestroyMethod() {
        LOGGER.info("CustomerServiceImpl#beanDestroyMethod");
    }
}
