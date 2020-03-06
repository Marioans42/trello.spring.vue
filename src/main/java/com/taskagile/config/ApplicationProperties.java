package com.taskagile.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * ApplicationProperties
 */
@Configuration
@ConfigurationProperties(prefix="app")
@Validated
public class ApplicationProperties {

    @Email
    @NotBlank
    private String mailFrom;
  
    public String getMailFrom() {
      return mailFrom;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
      }

}