package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdditionalStreamOperations {
	
	public static void main(String[] args) {
		
		//Defining the String[] 
		String[] names = {"Mahesh","Suresh","Nagesh","Rajesh","Naresh"};
		String[] duplicateNames = {"Mahesh","Suresh","Nagesh","Rajesh","Naresh","Mahesh","Rajesh"};
	
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
		
		//convert into stream from Array
		Stream<String> namesStream = Arrays.stream(names);
		
		//Wanted to collect the stream<String> into List object using java8 stream concept
		List<String> namesList = namesStream.collect(Collectors.toList());
		System.out.println(namesList);
		
		//Wanted to collect the stream<Strin> into Set object using Java8 Stream concept
		System.out.println("Before Operations::::" + Arrays.toString(duplicateNames));
		Set<String> namesSet = Arrays.stream(duplicateNames).collect(Collectors.toSet());
		System.out.println("After Operations::::" + namesSet);
		
		//Wanted to collect the Stream<String> as comma seperated values(a,b,c,d) using java8 stream concept
		String namesCommaSeperated = Arrays.stream(names).collect(Collectors.joining(","));
		System.out.println(namesCommaSeperated);
		
		//wanted to collect the Array of Names into map object 
		//where key should be name and value should be name Map<String,String> using java8 Stream concept
		//where key should be name and value should be length of name Map<String,Integer> using java8 Stream concept
		Map<String,String> users = new HashMap<>();
		Map<String,Integer> usersData = new HashMap<>();
		for(String eachName : names) {
			users.put(eachName,eachName);
			usersData.put(eachName, eachName.length());
		}
		System.out.println(users);
		System.out.println(usersData);
		
		//using Java8 Streams
		System.out.println("*************Java8 Streams*******************");
		Function<String,String> nameFunction = eachInput -> {
			return eachInput;
		};
		
		Function<String,String> valueFunction = eachInput -> {
			return eachInput;
		};
		
		Function<String,Integer> nameLengthFunction = eachInput ->{
			  return eachInput.length();
		};
		
		Map<String, String> userMap = 
		Arrays.stream(names).collect(Collectors.toMap(nameFunction, valueFunction));
		
		Map<String, String> userMap1 = 
		Arrays.stream(names).collect(Collectors.toMap(eachName -> eachName, eachvalue -> eachvalue));
		
		//current item input of collect() represent as key & value of Map object
		Arrays.stream(names).collect(Collectors.toMap(Function.identity(),nameLengthFunction));
		
		Map<String, Integer> usersDataMap = 
	    Arrays.stream(names).collect(Collectors.toMap(nameFunction, nameLengthFunction));
		Map<String, Integer> usersDataMap1 = 
		Arrays.stream(names).collect(Collectors.toMap(eachName-> eachName, eachNameLength -> eachNameLength.length()));

		System.out.println(userMap);
		System.out.println(userMap1);
		System.out.println(usersDataMap);
		System.out.println(usersDataMap1);
		
		//convert the List<Employee> into Map Object 
		//where key should be empId & value should be employeeName
		Map<Integer, String> empData = 
		employees.stream().collect(Collectors.toMap(emp -> emp.getEmpId(), emp -> emp.getEmpName()));
		System.out.println(empData);
		
		//converting the Map information into displaying Employee object
		empData.entrySet().stream().map(eachEntry -> {
			return new Employee(eachEntry.getKey(), eachEntry.getValue());
		}).forEach(emp -> System.out.println(emp));
		
		System.out.println("****************************************************");
		//converting the Map information into List<Employee> Object
		List<Employee> collect = 
		empData.entrySet()
		.stream()
		.map(eachEntry -> {
			return new Employee(eachEntry.getKey(), eachEntry.getValue());
		 })
		 .collect(Collectors.toList());
		collect.forEach(emp -> System.out.println(emp));
		System.out.println("****************************************************");
		
		//convert the List<Employee> into Map Object 
		//where key should be empId & value should be employee object(Function.identity())
		//Map<Integer,Employee> >>>> Map<Integer,Training>
	    Map<Integer, Employee> empInfo = 
	    //employees.stream().collect(Collectors.toMap(emp -> emp.getEmpId(), emp -> emp));
	    employees.stream().collect(Collectors.toMap(emp -> emp.getEmpId(), Function.identity()));
	    System.out.println(empInfo);
	}
}
