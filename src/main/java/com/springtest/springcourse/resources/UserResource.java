package com.springtest.springcourse.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.springcourse.entities.User;

@RestController
@RequestMapping (value ="/user")
public class UserResource {
	/*
	@GetMapping
	public ResponseEntity<String> findAll() {
	    return ResponseEntity.ok("Hello from UserResource!"); 
	}
	*/
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok(u); 
		
	}
}