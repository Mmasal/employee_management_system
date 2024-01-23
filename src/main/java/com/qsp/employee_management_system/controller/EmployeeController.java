package com.qsp.employee_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.employee_management_system.dao.EmployeeDao;
import com.qsp.employee_management_system.dto.Employee;
import com.qsp.employee_management_system.service.EmployeeService;
import com.qsp.employee_management_system.util.ResponseStructure;

import java.util.List;

@RestController
public class EmployeeController {

//	@Autowired
//	private EmployeeDao employeeDao;
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Employee>> saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/fetch")
	public ResponseEntity<ResponseStructure<Employee>> featchEmployee(@RequestParam int id) {
		return employeeService.featchEmployee(id);
	}

	@GetMapping("/fetchall")
	public ResponseEntity<ResponseStructure<List<Employee>>> fetchAllEmployee() {
		return employeeService.fetchAllEmployee();
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseStructure<Employee>> deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}
	
	@PutMapping("/updateall")
	public ResponseEntity<ResponseStructure<Employee>> updateEmployee(@RequestParam int id,@RequestBody Employee employee) {
		return employeeService.updateEmployee(id,employee);
	}
	
	@PostMapping("/saveall")
	public ResponseEntity<ResponseStructure<List<Employee>>> saveAllEmployee(@RequestBody List<Employee>employees){
		return employeeService.saveAllEmployee(employees);
	}
	
	@PatchMapping("/updatephone")
	public ResponseEntity<ResponseStructure<Employee>> updatePhone(@RequestParam int id,long phone) {
		return employeeService.updatePhone(id,phone);
	}
	
	@PatchMapping("/updateemail")
	public ResponseEntity<ResponseStructure<Employee>> updateEmail(@RequestParam int id,String email) {
		return employeeService.updateEmail(id,email);
	}
	
	@PatchMapping("/updatesalary")
	public ResponseEntity<ResponseStructure<Employee>> updateSalary(@RequestParam int id,double salary) {
		return employeeService.updateSalary(id,salary);
	}
	
	@GetMapping("/findbyphone")
	public ResponseEntity<ResponseStructure<Employee>> findByPhone(@RequestParam int phone) {
		return employeeService.findByPhone(phone);
	}
	
	@GetMapping("/findbyemail")
	public ResponseEntity<ResponseStructure<Employee>> findByEmail(@RequestParam String email) {
		return employeeService.findByEmail(email);
	}
	
	@GetMapping("/findbyaddress")
	public ResponseEntity<ResponseStructure<List<Employee>>> findByAddress(@RequestParam String address){
		return employeeService.findByAddress(address);
	}
	
	@GetMapping("/findbyname")
	public ResponseEntity<ResponseStructure<List<Employee>>> findByName(@RequestParam String name){
		return employeeService.findByName(name);
	}
	
	@GetMapping("/sallessthan")
	public ResponseEntity<ResponseStructure<List<Employee>>> salLessThan(@RequestParam double salary){
		return employeeService.salLessThan(salary);
	}
	
	@GetMapping("/salgreaterthan")
	public ResponseEntity<ResponseStructure<List<Employee>>> salGreaterThan(@RequestParam double salary){
		return employeeService.salGreaterThan(salary);
	}
	
	@GetMapping("/salbetween")
	public ResponseEntity<ResponseStructure<List<Employee>>> salBetween(@RequestParam double salary1,@RequestParam double salary2){
		return employeeService.salBetween(salary1,salary2);
	}
	
	@GetMapping("/findbygrade")
	public ResponseEntity<ResponseStructure<List<Employee>>> findByGrade(@RequestParam char grade){
		return employeeService.findByGrade(grade);
	}
}
