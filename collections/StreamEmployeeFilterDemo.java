package com.ashokit.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

//Wanted to display employees information who are resided in Hyderabad
public class StreamEmployeeFilterDemo {
	
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
		
		//1.Traditional approach To display Employee information resides in hyd
		ListIterator<Employee> empIterator = employees.listIterator();
		while(empIterator.hasNext()) {
			Employee currentEmpObj = empIterator.next();
			if("HYDERABAD".equals(currentEmpObj.getLocation().toUpperCase())) {
				System.out.println(currentEmpObj.getEmpId() +"===="+ currentEmpObj.getEmpName()+"======"+ currentEmpObj.getLocation());
			}
		}
		System.out.println("*****************************************************");
		
		List<Employee> hydEmpList = new ArrayList<>();
		//2.New approach To display Employee information resides in hyd using Java8 Streams
		//calling filter()
		employees
		.stream() //4 employee object
		.filter(eachEmp -> {
			return "HYDERABAD".equals(eachEmp.getLocation().toUpperCase());
		 })//2 employee object
		.forEach(emp -> {
			System.out.println(emp.getEmpId()+"===="+ emp.getEmpName()+"====" +emp.getLocation());
			hydEmpList.add(emp);
		 }); //printing 2 filtered employee objects
		 System.out.println("Hyd Employee List:::::" + hydEmpList);
	}
}
