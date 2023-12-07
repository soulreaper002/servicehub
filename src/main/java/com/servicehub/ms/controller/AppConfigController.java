package com.servicehub.ms.controller;

import com.common.util.properties.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class AppConfigController {

    @Autowired
    private MessageProperties messageProperties;
    @GetMapping("/configure")
    public String propertiesValue() {
        return messageProperties.getText();
    }
}