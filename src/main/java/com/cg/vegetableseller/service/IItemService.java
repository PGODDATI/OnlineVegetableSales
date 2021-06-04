package com.cg.vegetableseller.service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public interface IItemService{
		
		public Item addCustomer(Item item);
		
		public Iterable<Item> getAllItems();


}
