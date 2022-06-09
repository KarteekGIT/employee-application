package com.employee.employee_application;

import java.util.Optional;

import com.maven.dto.Employee;
import com.maven.service.EmployeeServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    	Employee employee = new Employee(101, "Arya", 1000.00, "Java");
    	Optional<Employee> addedEmployee = employeeService.addEmployee(employee);
    	if(addedEmployee.isPresent()) {
    		System.out.println("Employee added successfully");
    	}
    	
    	for(Employee e: employeeService.getEmployees()) {
    		System.out.println(e.getEmpId()+" : "+e.getEmpName());
    	}
    }
}
