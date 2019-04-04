package com.thisaru.customerapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CustomerapplicationApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerapplicationApplication.class, args);
    }

}
