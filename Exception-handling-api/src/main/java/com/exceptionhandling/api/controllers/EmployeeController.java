package com.exceptionhandling.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exceptionhandling.api.Entity.Employee;
import com.exceptionhandling.api.exceptions.ResourceNotFoundException;
import com.exceptionhandling.api.service.EmployeeServiceImpl;

@Controller
@RequestMapping("/exceptionHandling/employee")
public class EmployeeController {

	private EmployeeServiceImpl employeeServiceImpl;

	public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
		this.employeeServiceImpl = employeeServiceImpl;
	}
	
	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){
		return new ResponseEntity<>(employeeServiceImpl.createEmployee(emp),
				HttpStatus.CREATED); 
	}
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		return new ResponseEntity<>(employeeServiceImpl.getAllEmployees(),
				HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getById(@PathVariable(name="id") long id) {
		Employee emp= employeeServiceImpl.getEmployeeByid(id);
		return  ResponseEntity.ok().body(emp);
	}
	 
	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp, 
			@PathVariable(name="id") long id){
		Employee newEmp= employeeServiceImpl.updateEmployee(emp, id);
		return new ResponseEntity<Employee>(newEmp, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable(name="id") long id){
		employeeServiceImpl.deleteEmployee(id);
		return new ResponseEntity<String>("Employee Deleted Successfully", HttpStatus.OK);
	}
}
