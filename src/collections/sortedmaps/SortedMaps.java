package collections.sortedmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String> ();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String> ();
		Map<Integer, String> treeMap = new TreeMap<Integer, String> ();
//		hasMaps are not sorted
		System.out.println("1. hasMaps are not sorted");
		testMap(hashMap);
//		linkedHashMap are linked to previous and Next elements
		System.out.println("\n2. linkedHashMap are linked "
				+ "to previous and Next elements");
		testMap(linkedHashMap);
//		treeMaps are sorted in natural order for both numeric and alpha
		System.out.println("\n3. treeMaps are sorted in natural order"
				+ " for both numeric and alpha");
		
		testMap(treeMap);
		
	}
	
	public static void testMap(Map<Integer, String>map) {
		map.put(9, "Fox");
		map.put(65, "Snake");
		map.put(10, "Bear");
		map.put(66, "Horse");
		map.put(0, "Dog");
		map.put(25, "Cat");
		
//		For each loop
		for(int key:map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key +":"+ value);
		}
		
	}

}
