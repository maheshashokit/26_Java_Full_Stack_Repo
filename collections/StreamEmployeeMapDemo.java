package com.ashokit.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class StreamEmployeeMapDemo {
	
	public static void main(String[] args) {
		
		//Create Employee Objects
		Employee emp1 = new Employee(123,"Mahesh","Hyderabad");
		Employee emp2 = new Employee(354,"Suresh","Bangalore");
		Employee emp3 = new Employee(454,"Rajesh","Pune");
		Employee emp4 = new Employee(554,"Ramesh","Hyderabad");
		
		//Creating the ArrayList Object
		List<Employee> employees = new ArrayList<Employee>();
		
		//adding employee objects into List
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		List<EmployeeDTO> employeeDTOs = new ArrayList<>();
		
		Function<Employee,EmployeeDTO> empDtoFunction = eachEmp -> {
			return new EmployeeDTO(eachEmp.getEmpId(),eachEmp.getEmpName(),eachEmp.getLocation());
		};
		
		Consumer<EmployeeDTO> empDtoDisplay =empDtoObj -> {
			 System.out.println(empDtoObj.getEmpId()+"===="+ empDtoObj.getEmpName()+"====="+ empDtoObj.getLocation());
			 employeeDTOs.add(empDtoObj);
		};
		
		//transformation from Employee object into EmployeeDTO object......
		 employees.stream()
		 .map(empObj -> new EmployeeDTO(empObj.getEmpId(),empObj.getEmpName(),empObj.getLocation()))
		 .forEach(empDtoObj -> {
			 System.out.println(empDtoObj.getEmpId()+"===="+ empDtoObj.getEmpName()+"====="+ empDtoObj.getLocation());
			 employeeDTOs.add(empDtoObj);
		  });
		 
		 System.out.println("EmployeeDTOS::::" + employeeDTOs);
		 System.out.println("EmployeeDTOS::::" + employeeDTOs.size());
	}
}
