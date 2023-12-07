package com.servicehub.ms.config;

import com.common.util.properties.MessageProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@ConfigurationProperties("config")
@EnableConfigurationProperties
public class AppConfig {
    private String environment;
    private String host;
    private String url;

    @Autowired private MessageProperties messageProperties;
    public String checkMessage(){
        return messageProperties.getText();
    }
}
