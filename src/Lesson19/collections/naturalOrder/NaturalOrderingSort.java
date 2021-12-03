package Lesson19.collections.naturalOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

/*@author - Satyank
 * Since an object does not have a natural order for sorting
 * Collections.Sort will give error for list and also for a TreeSet
 * To avoid errors Comparable interface can be used with type as that of Object
 * viz. Person in this example
 */

class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.name);
	}
// Use the negative operator to sort in descending order 
	@Override
	public int compareTo(Person person) {
		//		return -name.compareTo(person.name);
		int len1 = name.length();
//		Length of name of person that is passed as parameter to this method
		int len2 = person.name.length();
//		i.e person with len1 sorts later than person with len2
		if(len1 > len2) {return 1;}
//		-1 means person with len1 is sorted earlier than person with len2
		else if(len1 < len2) {return -1;}
/*
 *For tree set if the lengths are equal and here if we return 0 then 
 *if 2 names are equal in length 
 *then program thinks that the values are equal too.
 *then 1 value will be ignored as 
 *Tree set can contain only unique values 
 *To handle this make sure that both objects are equal too 
 *using the compareTo method to compare objects in addition to the length for sorting
 */
		else {return name.compareTo(person.name);}
	}

	
	
	
}


public class NaturalOrderingSort {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
//		TreeSet keep natural sort order automatically
		SortedSet<Person> set = new TreeSet<Person>();
		
//		Since the methods are static, these 
//		can be directly used in this class
		addElements(list);
		addElements(set);
		
		
//		Sort the elements in List
		
		Collections.sort(list);
		showElements(list);
		System.out.println("\n");
		
// 		TreeSet are sorted and stored in natural order
		showElements(set);
		
		
		
	}
	
	private static void addElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Clare"));
		col.add(new Person("Mike"));
		
	}
	
	private static void showElements(Collection<Person> col) {
		for (Person element:col) {
			System.out.println(element);
		}
	}
		
}
