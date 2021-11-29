package collections.setBasics;

/*
 * Trying to Import java.util.HashSet was giving error
 * so used as below to resolve import error 
 */
import java.util.*;

public class SetBasics {

	public static void main(String[] args) {

		/*
		 * There are 3 types 1. HashSet 2. LinkedHashSet 3. TreeSet
		 */
//		HashSet doesn't retain order
//		Set <String> setOne = new HashSet<String>();
//		LinkedHashSet retains order
//		Set <String> setOne = new LinkedHashSet<String>();
//		TreeSet sorts in natural order
		Set<String> setOne = new TreeSet<String>();
		setOne.add("dog");
		setOne.add("cat");
		setOne.add("Snake");
		setOne.add("Bear");
//		Can't set duplicates
		setOne.add("Bear");

		System.out.println(setOne);
//		For each loop
		for (String value : setOne) {
			System.out.println(value);
		}

//		Does it contain a specific element
		if (setOne.contains("rat")) {
			System.out.println("Rat is here");
		}

		if (setOne.contains("Bear")) {
			System.out.println("Bear is here");
		}

		Set<String> setTwo = new TreeSet<String>();
		setTwo.add("dog");
		setTwo.add("cat");
		setTwo.add("Owl");
		setTwo.add("Crow");
	}
	
//	Find common items and retain - Intersection
	
// difference - both are giving errors need to do this later

}
