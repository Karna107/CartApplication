package com.example.CartApplication.Controller;

import java.sql.Date;
import java.sql.Time;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CartApplication.Service.AdminService;
import com.example.CartApplication.model.Customer;




@RestController
@RequestMapping("/CartApplication")
public class AdminController {
	private final AdminService adminService;
	public AdminController(AdminService adminService) {
		this.adminService=adminService;
	}
	@PostMapping(path="order", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> customerOrder(@RequestBody Customer customer ) {
		Date date = new Date(System.currentTimeMillis());
		Time time = new Time(System.currentTimeMillis());
		//System.out.println(customer.getName());
		adminService.customerOrder(customer);
		return ResponseEntity.ok("register successfully");
		
	}

}