package com.cg.vegetableseller.dto;

import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class AdminDTO {
	@Id
		private long adminId;
		private String name;
		private String password;
		private String emailId;
		private long phoneNumber;
		
		public long getAdminId() {
			return adminId;
		}
		public void setAdminId(long adminId) {
			this.adminId = adminId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
}
