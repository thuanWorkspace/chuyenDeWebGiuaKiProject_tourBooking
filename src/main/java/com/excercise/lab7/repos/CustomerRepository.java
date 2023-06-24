package com.excercise.lab7.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excercise.lab7.entity.Customer;

//
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
