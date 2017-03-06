package com.app.module;

import com.core.module.MessageService;
import org.apache.log4j.Logger;

public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        MessageService messageService = new MessageService();

        String message = messageService.getMessage();
        LOGGER.info("Received message: " + message);
    }
}
