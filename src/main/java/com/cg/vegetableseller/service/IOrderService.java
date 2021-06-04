package com.cg.vegetableseller.service;

import com.cg.vegetableseller.entity.Order;

public interface IOrderService{
		
		public Order addCustomer(Order order);
		
		public Iterable<Order> getAllOrders();

}
