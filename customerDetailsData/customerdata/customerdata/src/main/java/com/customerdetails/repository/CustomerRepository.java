package com.customerdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerdetails.customerdata.customer.CustomerBean;

public interface CustomerRepository extends JpaRepository<CustomerBean,Integer> {

}
