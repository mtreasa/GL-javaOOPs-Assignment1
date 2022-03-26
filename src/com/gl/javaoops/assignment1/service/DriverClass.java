package com.gl.javaoops.assignment1.service;

public class DriverClass {
	public static void printwelcome(String s) {
		System.out.println();
		System.out.println("Welcome to " + s);
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		AdminDepartment oAdminDepartment = new AdminDepartment();
		HrDepartment oHrDepartment = new HrDepartment();
		TechDepartment oTechDepartment = new TechDepartment();
		
		
		printwelcome(oAdminDepartment.departmentName());
		print(oAdminDepartment.getTodaysWork());
		print(oAdminDepartment.getWorkDeadline());
		print(oAdminDepartment.isTodayAHoliday());
		
		printwelcome(oHrDepartment.departmentName());
		print(oHrDepartment.doActivity());
		print(oHrDepartment.getTodaysWork());
		print(oHrDepartment.getWorkDeadline());
		print(oHrDepartment.isTodayAHoliday());
		
		printwelcome(oTechDepartment.departmentName());
		print(oTechDepartment.getTodaysWork());
		print(oTechDepartment.getWorkDeadline());
		print(oTechDepartment.getTechStackInformation());
		print(oTechDepartment.isTodayAHoliday());
	    	}

}
