package com.ashokit.collections;

public class GenericMethodExample {
  
	public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
	
	public static <T, V> T doMessage(T content , V content1) {
		System.out.println("Content   :::" + content);
		System.out.println("Content-1 :::" + content1);
		return content;
	}

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        printArray(intArray);

        String[] stringArray = {"Hello", "World"};
        System.out.println("String Array:");
        printArray(stringArray);
    }
}