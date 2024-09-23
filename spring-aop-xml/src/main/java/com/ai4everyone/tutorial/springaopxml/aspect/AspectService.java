package com.ai4everyone.tutorial.springaopxml.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AspectService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AspectService.class);

    public void beforeService() {
        LOGGER.info("AspectService#beforeService");
    }

    public void afterService() {
        LOGGER.info("AspectService#afterService");
    }
}
