package lessons.basics.staticVariableAndMethods;

class Things {
	/*
	 * This is an instance variable Multiple copies of the variable can exist
	 */
	public String name;
	/*
	 * This is the class/Static variable and there can be only one copy of it Can be
	 * accessed in main method directly via the class
	 */
	public static String description;
	/*
	 * 'final' keyword in variables makes the value constant
	 * you have to declare value when declaring the constant
	 * Value cannot be changed
	 * uS
	 * */
	public static final int LUCKY_NUMBER=7;
	
	/*
	 * Uses of static variables
	 * 
	 * */
	public static int count = 0;
	/*
	 * now create an constructor to use this
	 * such that the count is incremented 
	 * every time an object is created
	 * */
	
	public Things(){
		count++;
	}
	/* instance methods */
	public void showName() {
		System.out.println("name being displayed via method: " + name);
	}

	/*
	 * Static methods can be accessed directly using the class
	 * Static method can access static data
	 * but non-static data can't be used in these methods.
	 * E.g. Variable name can't be used but static variable
	 * description can be used as seen below.  
	 * 
	 */

	public static void showDescription() {
			System.out.println("Print description using the method: "+ description);
	}
}

public class StaticVariableAndMethods {
	public static void main(String[] args) {
//		using the class / static method
		Things.description = "Hello! I'm a value stored in static variable";
		System.out.println(Things.description);

// 		Use the static constant value
		System.out.println("My lucky number is: "+Things.LUCKY_NUMBER);
//		Initial count
		System.out.println("Initial count before any object created is: "+ Things.count);
		
//		Create objects
		Things thing1 = new Things();
		Things thing2 = new Things();
		
//		Accessing the instance variables using the object
		thing1.name = "betty";
		thing2.name = "alice";

		System.out.println(thing1.name);
		System.out.println(thing2.name);



// using the instance method to print the names		
		thing1.showName();
		thing2.showName();
//		print description using the static method
		Things.showDescription();
		
		System.out.println("Final count of objects created is: "+ Things.count);

	}
}
