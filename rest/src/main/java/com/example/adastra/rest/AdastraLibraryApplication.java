package com.example.adastra.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.adastra"})
@EnableJpaRepositories(basePackages = {"com.example.adastra.persistence.repositories"})
@EntityScan(basePackages = {"com.example.adastra.persistence.entities"})
public class AdastraLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdastraLibraryApplication.class, args);
    }

}
