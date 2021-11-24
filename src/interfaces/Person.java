package interfaces;
/*
 * A class can extend a class and implement an interface at the same time.
 */

public class Person implements Info {
	private String name;
//	this is a constructor
	public Person(String name) {
		this.name = name;
	}
// Method in the Person class
	public void greet() {
		System.out.printf("\nHello\t %s\n",name);
	}

// Method from the interface	
	public void showInfo() {
		System.out.println("Person name is: "+ name);
		
	}

}
