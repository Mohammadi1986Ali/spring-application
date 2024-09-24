package com.ai4everyone.tutorial.springiocconstructor.service;

import com.ai4everyone.tutorial.springiocconstructor.api.CustomerService;
import com.ai4everyone.tutorial.springiocconstructor.api.GeneralService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneralServiceImpl implements GeneralService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeneralService.class);
    private CustomerService service;

    public GeneralServiceImpl() {
        LOGGER.info("GeneralServiceImpl#GeneralServiceImpl");
    }

    public GeneralServiceImpl(CustomerService service) {
        LOGGER.info("GeneralServiceImpl#GeneralServiceImpl {}", service.getClass());
        this.service = service;
    }

    public CustomerService getService() {
        return service;
    }

    public void setService(CustomerService service) {
        this.service = service;
    }

    public void beanInitMethod() {
        LOGGER.info("GeneralServiceImpl#beanInitMethod");
    }

    public void beanDestroyMethod() {
        LOGGER.info("GeneralServiceImpl#beanDestroyMethod");
    }
}
