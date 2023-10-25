package com.library.controller;

import com.library.service.AdminService;

public class ApproveLibrarian {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		boolean res = adminService.approveLibrarianById(4,2);
		System.out.println(res);
	}
}
