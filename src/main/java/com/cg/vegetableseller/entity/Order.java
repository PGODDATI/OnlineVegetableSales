package com.cg.vegetableseller.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Order_info")
public class Order {
	private long customerId;
	private long orderId;
	private LocalDate date;
	private LocalTime time;
	private String statusOfOrder;
	private double totalAmount;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getStatusOfOrder() {
		return statusOfOrder;
	}
	public void setStatusOfOrder(String statusOfOrder) {
		this.statusOfOrder = statusOfOrder;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}
