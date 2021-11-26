package collections.linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedVsArrayLists {

	public static void main(String[] args) {
		List <Integer> arrayList = new ArrayList<Integer>();
		List <Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);

	}
	
	public static void doTimings(String type, List<Integer> list) {
		for (int i=0; i<1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
//	Add items to end 	
		for (int i=0; i<1E5; i++) {
			list.add(i);
		}
		
//		Add items elsewhere - linked list is faster than array list here
		for (int i=0; i<1E5; i++) {
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken to complete "+ (end -start)+ "ms for "+type);
		
	}

}
