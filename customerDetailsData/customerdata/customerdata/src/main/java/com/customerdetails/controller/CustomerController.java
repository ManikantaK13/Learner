package com.customerdetails.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.customerdetails.customerdata.customer.CustomerBean;
import com.customerdetails.serviceImplementaion.CustomerServiceInterface;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerServiceInterface customerService;
	
	//Post mapping creating user record in database
	@GetMapping("/create")
	public ResponseEntity<CustomerBean> createCustomer(@RequestBody CustomerBean customer ){
		CustomerBean creat =this.customerService.createNewCustomer(customer);
		return new ResponseEntity<>(creat,HttpStatus.CREATED);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
