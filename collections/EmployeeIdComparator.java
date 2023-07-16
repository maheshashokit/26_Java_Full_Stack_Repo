package com.ashokit.collections;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		
		return o1.getEmpId().compareTo(o2.getEmpId());
	}
}