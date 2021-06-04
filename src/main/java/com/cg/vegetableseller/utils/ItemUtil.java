package com.cg.vegetableseller.utils;

import java.util.ArrayList;
import java.util.List;

import com.cg.vegetableseller.dto.ItemDTO;
import com.cg.vegetableseller.entity.Item;

public class ItemUtil {
		public static List<ItemDTO> convertToItemDtoList(List<Item> list){
			List<ItemDTO> dtolist = new ArrayList<ItemDTO>();
			for(Item item : list) 
				dtolist.add(convertToItemDto(item));
			return dtolist;
		}
		
		public static Item convertToItem(ItemDTO itemdto) {
			Item item = new Item();
			item.setItemId(itemdto.getItemId());
			item.setItemPrice(itemdto.getItemPrice());
			item.setItemName(itemdto.getItemName());
			
			return item;
		}
		
			public static ItemDTO convertToItemDto(Item item) {
				
				ItemDTO itemdto = new ItemDTO();
				itemdto.setItemId(item.getItemId());
				itemdto.setItemPrice(item.getItemPrice());
				itemdto.setItemName(item.getItemName());
				
				return itemdto;
			}
			
}
