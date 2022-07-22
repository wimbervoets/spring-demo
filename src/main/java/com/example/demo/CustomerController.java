package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerRepository customerRepository;

    @GetMapping
    public Customers getCustomers() {
        LOG.info("getCustomers");
//        return new Customers().customers(customerRepository.findAll());
        return new Customers().customers(customerRepository.findTop3ByLastName("Bauer"));
    }
}
