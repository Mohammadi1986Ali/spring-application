package com.ai4everyone.tutorial.springaopannotation.service;

import com.ai4everyone.tutorial.springaopannotation.api.CustomerService;
import com.ai4everyone.tutorial.springaopannotation.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerServiceImpl implements CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

    public CustomerServiceImpl() {
        LOGGER.info("CustomerServiceImpl#CustomerServiceImpl");
    }

    @Override
    public List<Customer> findAllCustomer() {
        LOGGER.info("CustomerServiceImpl#findAllCustomer");
        return null;
    }

    @Override
    public Optional<Customer> findCustomerById(Long customerId) {
        LOGGER.info("CustomerServiceImpl#findCustomerById {}", customerId);
        return Optional.empty();
    }
}
