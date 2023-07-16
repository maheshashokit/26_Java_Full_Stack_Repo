package com.ashokit.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetDemo {
	
	public static void main(String[] args){
		
		//Creating Object HashSet Object
		HashSet<Integer> numberSet1 = new HashSet<Integer>();
		HashSet<Integer> numberSet2 = new HashSet<Integer>();
		
		//Adding the elements to Set object
		for(int i =1 ; i<=15; i++) {
			numberSet1.add(i);
		}
		for(int i =1 ; i<=5; i++) {
			numberSet2.add(i);
		}
		//trying to add duplicate values and it will not add it
		numberSet1.add(12);
		numberSet1.add(13);
		numberSet1.add(14);
		
		System.out.println("Data From Set Object-1::::" + numberSet1);
		System.out.println("Size of Set Object  ::::" + numberSet1.size());
		System.out.println("Data From Set Object-2::::" + numberSet2);
		System.out.println("Size of Set Object  ::::" + numberSet2.size());
		
		//getting the common elements from two sets
		//set  >>>>> Mahesh Suresh Rajesh,Anil,Balu
	    //another set  >>>>> Mahesh Suresh Rajesh     
		//O/P : Both Sets will contains same(Mahesh Suresh Rajesh)
		
		//set  >>>>> Mahesh Suresh Rajesh,Anil,Balu
	    //another set  >>>>> Mahesh Suresh Rajesh,Smith    
		//O/P : Both Sets will remains original data and flag will returns false
				
		boolean retainFlag = numberSet1.retainAll(numberSet2);
		if(retainFlag) {
			System.out.println("Common Elements Are available");
			System.out.println("NumberSet-1::::" + numberSet1);
			System.out.println("NumberSet-2::::" + numberSet2);
		}
		
		//Creating the ArrayList
		List<Integer> nosList = new ArrayList<>();
		nosList.add(125);
		nosList.add(125);
		nosList.add(150);
		nosList.add(175);
		
		//Adding the List object to Set Object
		numberSet1.addAll(nosList);
		System.out.println("numberList-1:::::" + numberSet1);
		
		//checking one set elements to another set
		boolean containsFlag = numberSet1.containsAll(numberSet2);
		System.out.println("Contains Flag::::" + containsFlag);
		
		
		//processing the HashSet data
		System.out.println("Number Set-1" + numberSet1);
		
		//processing using java8 
		numberSet1.forEach(eachNumber -> System.out.println(eachNumber));
		
		//filter the filter from number set-1
		Set<Integer> evenNumberSet = 
		 numberSet1.stream()
		.filter(eachNumber -> { return eachNumber %2 ==0 ;})
		.collect(Collectors.toSet());
		System.out.println("even Number Set::::" + evenNumberSet);
	}
}