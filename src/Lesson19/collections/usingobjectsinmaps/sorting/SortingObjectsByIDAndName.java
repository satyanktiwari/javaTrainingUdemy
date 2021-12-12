package Lesson19.collections.usingobjectsinmaps.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person {id=" + id + ", name=" + name + "}";
	}
	
	
}

public class SortingObjectsByIDAndName {

	public static void main(String[] args) {
		List <Person> people = new ArrayList<Person>();
		people.add(new Person(1,"Joe"));
		people.add(new Person(3,"Bob"));
		people.add(new Person(4,"Claire"));
		people.add(new Person(2,"Sue"));
		
//		Collection sort can't be used directly as it will give error
//		Collections.sort(people);
		
		Collections.sort(people, new Comparator<Person>() {
//Compare by id
			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getId()>p2.getId()) {return 1;}
				else if(p1.getId()<p2.getId()) {return -1;}
				return 0;
			}
			
		});
		
		for (Person person:people) {
			System.out.println(person);
		}
//		Same thing can be implemented to compare names
		System.out.println("____________\n");
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		
		for (Person insan:people) {
			System.out.println(insan);
		}
		
		
		
	}

}
