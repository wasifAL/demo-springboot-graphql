package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class OrganizationInitiator implements ApplicationRunner {

    private final OrganizationRepository repository;

    public OrganizationInitiator(OrganizationRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Organization> organizationList = Arrays.asList(
            new Organization(1,"TCL1","a@A.c","0127456","dhk"),
            new Organization(2,"TCL2","a@A.c","0127456","dhk"),
            new Organization(3,"TCL3","a@A.c","0127456","dhk")
        );
        repository.saveAll(organizationList);
    }
}
