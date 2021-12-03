package Lesson19.collections.hashmaps;

import java.util.HashMap;
import java.util.Map;
/*
 * HashMap doesn't maintain order
 */
public class HashMapsCollection {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(8, "Eight");
		map.put(7, "Seven");
		map.put(6, "Six");
		map.put(5, "Five");
//		Only key is required to get the value
		String text = map.get(7);
		System.out.println(text);
//		if key does not exist then null will be printed
		String text1 = map.get(1);
		System.out.println(text1);
		System.out.println("\n");
		
//		For loop
		for(Map.Entry<Integer, String>entry:map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ":"+ value);
		}
	}
}
