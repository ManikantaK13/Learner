package com.customerdetails.serviceImplementaion;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.customerdetails.customerdata.customer.CustomerBean;
import com.customerdetails.repository.CustomerRepository;


import lombok.extern.log4j.Log4j;

@Service("CustomerServiceImp")
@Log4j
public class CustomerServiceImplemention implements CustomerServiceInterface {

	@Autowired
	private CustomerRepository customerRepo;
	

	@Override
	public CustomerBean createNewCustomer(CustomerBean customer) {
		
		CustomerBean reesponse = customerRepo.save(customer);
		
		return customer;  
			
	}

}
