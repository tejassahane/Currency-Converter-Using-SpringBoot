package com.kodnest.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodnest.app.entities.Employee;
import com.kodnest.app.repositories.EmployeeRepo;

@Service
public class EmployeeService {

	EmployeeRepo employeeRepo;

	public EmployeeService(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}
	
	 public List<Employee> getAllEmployees(){
		 return employeeRepo.findAll();
	 }
	 
	 public Employee getEmployee(int id) {
		 return employeeRepo.findById(id).orElse(null);
	 }
	 
	 public void deleteEmployee(Employee ref) {
		 employeeRepo.delete(ref);
	 }
	 
	 public Employee addEmployee(Employee ref) {
		 return employeeRepo.save(ref);
	 }
	 
	 
	 
	 
	 
	
}
