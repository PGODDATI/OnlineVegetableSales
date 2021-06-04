package com.cg.vegetableseller.dto;

import org.springframework.stereotype.Component;

@Component
public class ItemDTO {
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

