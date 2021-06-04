package com.cg.vegetableseller.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Items_info")
public class Item {
	private long itemId;
	private double itemPrice;
	private String itemName;
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}
