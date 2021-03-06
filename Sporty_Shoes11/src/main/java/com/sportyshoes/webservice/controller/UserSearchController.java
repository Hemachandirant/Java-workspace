package com.sportyshoes.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.webservice.model.User;
import com.sportyshoes.webservice.service.UserService;


@RestController
public class UserSearchController {

	@Autowired
	UserService service;
	
	@GetMapping("/User")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}
	
	@GetMapping("/User/name/{name}")
	public List<User> getAllUsersByName(@PathVariable String name) {
		return service.getAllUsersByName(name);
	}
	
	@GetMapping("/User/role/{role}")
	public List<User> getAllUsersByRole(@PathVariable String role) {
		return service.getAllUsersByRole(role);
	}
}
