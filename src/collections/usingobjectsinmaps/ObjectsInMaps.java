package collections.usingobjectsinmaps;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}

public class ObjectsInMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Marley");
		Person p3 = new Person(2, "Charlton");
		Person p4 = new Person(1, "Marley");

		Map<Person, Integer> map = new HashMap<Person, Integer>();
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 1);
		for (Person key : map.keySet()) {
			System.out.println(key + " :" + map.get(key));
		}
		
		Set<Person> set = new LinkedHashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println("\nElements in set are:\n"+set);
	}

}
