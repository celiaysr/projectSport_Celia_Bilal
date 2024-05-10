package com.celiabilal.projectsport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EntityScan(basePackages = {"com.celiabilal.projectsport.entities"})  // force scan JPA entities
@ComponentScan(basePackages = {"com.celiabilal.projectsport.repositories", "com.celiabilal.projectsport.controller", "com.celiabilal.projectsport.services", "com.celiabilal.projectsport.security"})
public class ProjectSportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectSportApplication.class, args);
    }

}

