package com.nt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.UserEntity;
import com.nt.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> createUser(@RequestBody UserEntity userEntity){
		String ststus= service.upsert(userEntity);
		return new ResponseEntity<>(ststus,HttpStatus.CREATED); 
	} 
	
	@GetMapping("/get/{userId}")
	public ResponseEntity<UserEntity> getUser(@PathVariable Integer userId){
		UserEntity userEntity= service.getById(userId);
		return new ResponseEntity<UserEntity>(userEntity,HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<UserEntity>> getAllUsers(){
		List<UserEntity> list= service.getAllUsers();
		return new ResponseEntity<List<UserEntity>>(list,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateUser(@RequestBody UserEntity userEntity){
		String status= service.upsert(userEntity);
	        return new ResponseEntity<String>(status,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer userId){
		String status= service.deleteById(userId);
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}
	
	
	         
}
