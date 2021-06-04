package com.cg.vegetableseller.utils;

import java.util.ArrayList;
import java.util.List;

import com.cg.vegetableseller.dto.OrderDTO;
import com.cg.vegetableseller.entity.Order;


public class OrderUtil {
		public static List<OrderDTO> convertToOrderDtoList(List<Order> list){
			List<OrderDTO> dtolist = new ArrayList<OrderDTO>();
			for(Order order : list) 
				dtolist.add(convertToOrderDTO(order));
			return dtolist;
		}
		
		public static Order convertToOrder(OrderDTO orderdto) {
			Order order = new Order();
			order.setCustomerId(orderdto.getCustomerId());
			order.setOrderId(orderdto.getOrderId());
			order.setDate(orderdto.getDate());
			order.setTime(orderdto.getTime());
			order.setStatusOfOrder(orderdto.getStatusOfOrder());
			order.setTotalAmount(orderdto.getTotalAmount());
			
			return order;
		}
		
			public static OrderDTO convertToOrderDTO(Order order) {
				
				OrderDTO orderdto = new OrderDTO();
				orderdto.setCustomerId(order.getCustomerId());
				orderdto.setOrderId(order.getOrderId());
				orderdto.setDate(order.getDate());
				orderdto.setTime(order.getTime());
				orderdto.setStatusOfOrder(order.getStatusOfOrder());
				orderdto.setTotalAmount(order.getTotalAmount());
				
				return orderdto;
			}
			
}
