package com.customerdetails.modelmapper;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapper {

	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
