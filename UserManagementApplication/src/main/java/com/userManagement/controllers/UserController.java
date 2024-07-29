package com.userManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userManagement.Entities.User;
import com.userManagement.exceptions.ResourceNotFound;
import com.userManagement.repositories.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	//Get all users : http://localhost:8080/api
	@GetMapping
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	//Get user by id : http://localhost:8080/api/3
	@GetMapping("/{id}")
	public User getUserById(@PathVariable long id) {
		return this.userRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFound("User not found with user id :"+ id));
	}
	
	// Create new user
	@PostMapping
	public User creatUser(@RequestBody  User user){
		return userRepository.save(user);
	}
	
	// Update user
	@PutMapping("{id}")
	public User updateUser(@RequestBody User user, @PathVariable long id) {
		User existingUser= userRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFound("User not found to update"));
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());
		return userRepository.save(existingUser);
	}
	
	//Delete user
	@DeleteMapping("{id}")
	public ResponseEntity<User> deleteUser(@PathVariable long id){
		User existingUser= userRepository
				.findById(id).orElseThrow(()-> new ResourceNotFound("User not found to update"));
		userRepository.delete(existingUser);
		return ResponseEntity.ok().build();
	}
}
