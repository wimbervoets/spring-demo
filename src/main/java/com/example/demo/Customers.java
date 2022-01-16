package com.example.demo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(fluent = true)
public class Customers {

    private List<Customer> customers;
}
