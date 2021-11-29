package collections.usingobjectsinmaps;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class ObjectsInMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(1, "Bob");
		Person p1 = new Person(1, "Bob");
		Person p1 = new Person(1, "Bob");
		Person p1 = new Person(1, "Bob");

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("One", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("two", 2);
		for (String key : map.keySet()) {
			System.out.println(key + " :" + map.get(key));
		}
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("Cat");
		set.add("mouse");
		set.add("crow");
		set.add("mouse");
		System.out.println("\nElements in set are:\n"+set);
	}

}
