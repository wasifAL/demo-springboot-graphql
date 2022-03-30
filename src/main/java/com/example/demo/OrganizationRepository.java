package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.graphql.data.GraphQlRepository;

@GraphQlRepository
public interface OrganizationRepository extends JpaRepository<Organization,Integer>, QuerydslPredicateExecutor<Organization> {
}
