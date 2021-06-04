package com.cg.vegetableseller.service;

import com.cg.vegetableseller.entity.Customer;

public interface ICustomerService{
		
		public Customer addCustomer(Customer customer);
		
		public Iterable<Customer> getAllCustomers();

}
