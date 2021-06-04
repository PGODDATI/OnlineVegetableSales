package com.cg.vegetableseller.utils;

import java.util.ArrayList;
import java.util.List;

import com.cg.vegetableseller.dto.AdminDTO;
import com.cg.vegetableseller.entity.Admin;

public class AdminUtil {
		public static List<AdminDTO> convertToAdminDtoList(List<Admin> list){
			List<AdminDTO> dtolist = new ArrayList<AdminDTO>();
			for(Admin admin : list) 
				dtolist.add(convertToAdminDto(admin));
			return dtolist;
		}
		
		public static Admin convertToItem(AdminDTO admindto) {
			Admin admin = new Admin();
			admin.setName(admindto.getName());
			admin.setPassword(admindto.getPassword());
			admin.setEmailId(admindto.getEmailId());
			admin.setPhoneNumber(admindto.getPhoneNumber());
			
			return admin;
		}
		
			public static AdminDTO convertToAdminDto(Admin admin) {
				
				AdminDTO admindto = new AdminDTO();
				admindto.setName(admin.getName());
				admindto.setPassword(admin.getPassword());
				admindto.setEmailId(admin.getEmailId());
				admindto.setPhoneNumber(admin.getPhoneNumber());
				
				return admindto;
			}
			
}
