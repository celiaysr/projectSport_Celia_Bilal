package com.celiabilal.projectsport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.celiabilal.projectsport.repositories", "com.celiabilal.projectsport.entities"})
public class ProjectSportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectSportApplication.class, args);
    }

}
