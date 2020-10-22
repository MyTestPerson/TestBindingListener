package com.testbindinglistener.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@Service
public class UserActive implements HttpSessionBindingListener {

    Logger logger = LoggerFactory.getLogger(UserActive.class);

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        logger.info("Log in : {}", event.getName() );
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        logger.info("Log out : {}", event.getName() );
    }

}