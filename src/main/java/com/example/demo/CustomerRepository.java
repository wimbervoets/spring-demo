package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findById(long id);

    List<Customer> findAll();

    List<Customer> findByLastName(String lastName);

    List<Customer> findTop3ByLastName(String lastName);
}
