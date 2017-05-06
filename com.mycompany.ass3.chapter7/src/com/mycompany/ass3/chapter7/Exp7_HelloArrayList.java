package com.mycompany.exp2b2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		List<String>  strings;
		List<Integer> integers;
		// initializations - NOTE ilker do not need to set a size (like we do with arrays). Its size is dynamic.
		strings = new ArrayList<String>();
		integers = new ArrayList<Integer>();
		// declaration and initialization together
		List<Integer> integers2 = new ArrayList<Integer>();
		
		strings.add("ilker");	// NOTE using "add"
		strings.add("kiris");
		strings.add(0, "Dr.");	// NOTE added at 0th index. Otherwise it would have been added at 2nd index
		System.out.println("strings:" + strings);	
		System.out.println("Do strings contains 'ilker':" + strings.contains("ilker"));	// NOTE using "contains"
		System.out.println("index of 'kiris' in strings:" + strings.indexOf("kiris"));	// NOTE using "indexOf"
		System.out.println("element at 1st index of strings:" + strings.get(1));		// NOTE using "get"	
		System.out.println("strings has " + strings.size() + " elements");				// NOTE using "size"
		// fill up 'integers' and play with it
		for (int i = 0; i < 5; i++) {
			integers.add(i);
		}
		System.out.println("integers:" + integers);
		// for each loop over the List<T>
		int index = 0;
		for (Integer integer : integers) {
			System.out.println(index++ + "th element of integers:" + integer);
		}
		// fill up integers2 and play with it
		integers2.addAll(integers);
		System.out.println("AFTER adding all of integers to integers2, integer2:" + integers2);	// prints [0, 1, 2, 3, 4]
		
		Integer[] intArray = {5,6,7,8,9,100,200};
		List<Integer> fixedSizeListBackedByArray = Arrays.asList(intArray);	
		integers2.addAll(Arrays.asList(intArray));		
		
		System.out.println("AFTER adding all elements of intArray to integers2, integer2:" + integers2);	// prints [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 200]
		System.out.println("size of integers2:" + integers2.size());	//prints 12
		integers2.remove(new Integer(200));	// NOTE using "remove" a specific element
		System.out.println("AFTER removing 100 from integers2, integer2:" + integers2);	// prints [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100]
		integers2.remove(10);	// NOTE using "remove" at an index
		System.out.println("AFTER removing 100 at the 10th index from integers2, integer2:" + integers2);	// prints [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		integers2.clear();	// NOTE using "clear"
		System.out.println("AFTER clearing integers2, integer2:" + integers2);	// prints []
	}

}