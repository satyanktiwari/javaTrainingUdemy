package Lesson19.collections.arraylists;

import java.util.ArrayList;
import java.util.List;

/*
 * In collections we use different classes
 * for e.g. ArrayList
 * After that we have to specify type of class in diamond brackets
 * ArrayList<Integer> number
 * default size is 10 
 */
public class Arrayslist {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		Add numbers to list
		numbers.add(10);
		numbers.add(12);
		numbers.add(50);
		numbers.add(100);
//	Retrieving single value	
		System.out.println(numbers.get(0));
		
//		Use for loop
		System.out.println("\nIteration 1: ");
		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
//		remove first item from list
		numbers.remove(0);
//		Remove last item from list
		numbers.remove(numbers.size()-1);
		
//		Using modified for loop
		System.out.println("\n Iteration 2: ");
		for (Integer value:numbers) {
			System.out.println(value);
		}
//		List interface
//		Below code is valid is used widely.
		List<String> values = new ArrayList<String>();
	}
}
