package com.cg.vegetableseller.utils;

import java.util.ArrayList;
import java.util.List;

import com.cg.vegetableseller.dto.CustomerDTO;
import com.cg.vegetableseller.entity.Customer;

public class CustomerUtil {
		public static List<CustomerDTO> convertToCustomerDtoList(List<Customer> list){
			List<CustomerDTO> dtolist = new ArrayList<CustomerDTO>();
			for(Customer customer : list) 
				dtolist.add(convertToCustomerDto(customer));
			return dtolist;
		}
		
		public static Customer convertToCustomer(CustomerDTO customerdto) {
			Customer customer = new Customer();
			customer.setCustomerId(customerdto.getCustomerId());
			customer.setFirstName(customerdto.getFirstName());
			customer.setLastName(customerdto.getLastName());
			customer.setPassword(customerdto.getPassword());
			customer.setEmailId(customerdto.getEmailId());
			customer.setPhoneNumber(customerdto.getPhoneNumber());
			customer.setAddress(customerdto.getAddress());
			
			return customer;
		}
		
			public static CustomerDTO convertToCustomerDto(Customer customer) {
				
				CustomerDTO customerdto = new CustomerDTO();
				customerdto.setCustomerId(customer.getCustomerId());
				customerdto.setFirstName(customer.getFirstName());
				customerdto.setLastName(customer.getLastName());
				customerdto.setPassword(customer.getPassword());
				customerdto.setEmailId(customer.getEmailId());
				customerdto.setPhoneNumber(customer.getPhoneNumber());
				customerdto.setAddress(customer.getAddress());
				
				return customerdto;
			}
			
		

	}
