package com.exceptionhandling.api.service;

import java.util.List;
import java.util.Optional;

import com.exceptionhandling.api.Entity.Employee;

public interface EmployeeService {
      
    public Employee createEmployee(Employee emp); 
    
    public List<Employee> getAllEmployees();
    
    public Employee getEmployeeByid(long id);
    
    public Employee updateEmployee(Employee emp, long id);
    
    public void deleteEmployee(long id);
}
 