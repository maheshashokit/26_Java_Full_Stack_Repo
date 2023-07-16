package com.ashokit.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map<String,String> javaTrainers = new HashMap<>();
		//adding the data to map object
		javaTrainers.put("Mahesh","JFSD");
		javaTrainers.put("Ashok","SpringBoot");
		javaTrainers.put("Suresh","WebDevelopment");
		javaTrainers.put("Ramesh","PHP");
		javaTrainers.putIfAbsent("Mahesh1", "Oracle");
		System.out.println("JavaTrainers:::::" + javaTrainers);
		
		Map<String,String> webTrainers = new HashMap<>();
		webTrainers.put("Ravi","HTML");
		webTrainers.put("Kumar","CSS");
		webTrainers.put("Sarath","JavaScript");
		System.out.println("WebTrainers :::::::" + webTrainers);
		
		Map<String,String> allTrainersInfo = new HashMap<>();
		allTrainersInfo.putAll(javaTrainers);
		allTrainersInfo.putAll(webTrainers);
		System.out.println(allTrainersInfo);
		
		//processing the map information using keySet(),entrySet()
		Set<String> keySet = allTrainersInfo.keySet();
		//Traditional approach
		Iterator<String> setIterator = keySet.iterator();
		while(setIterator.hasNext()) {
			//current key from Map object
			String currentKey = setIterator.next();
			//extract the value from map object using currentKey
			String currentValue = allTrainersInfo.get(currentKey);
			System.out.println(currentKey+"======"+ currentValue);
		}		
		System.out.println("****************************************************");
		//Java8 Style for iterating the Map Object
		allTrainersInfo.keySet().forEach(eachKey  -> {
			String eachValue = allTrainersInfo.get(eachKey);
			System.out.println(eachKey + "=======" + eachValue);
		});
		System.out.println("****************************************************");
		Set<Entry<String, String>> entrySet = allTrainersInfo.entrySet();
		//TraditionalApproach
		Iterator<Entry<String, String>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
		   Entry<String, String> currentEntry = entryIterator.next();
		   System.out.println(currentEntry.getKey()+"=============="+currentEntry.getValue());
		}
		System.out.println("***************************************************");
		//Java8 Style
		allTrainersInfo.entrySet().forEach(eachEntry -> {
			System.out.println(eachEntry.getKey() + " -----" + eachEntry.getValue());
		});
	}
}