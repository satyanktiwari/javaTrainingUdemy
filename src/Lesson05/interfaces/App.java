package Lesson05.interfaces;

public class App {
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("bob");
		person1.greet();
		/*
		 *An interface Info is implementing a new machine
		 *here info1 variable will have access to the only method
		 *available in the interface 
		 */
		Info info1 = new Machine();
		info1.showInfo();
		
		Info personInfo = new Person("Robot");
		personInfo.showInfo();
		/*
		 * This can be done as person implement Info 
		 * So person1 points to the object new Person("bob")
		 * and now we are saying that info2 variable points to same thing
		 * that the person1 points at.
		 */
		Info info2 = person1;
		info2.showInfo();
		
//		Another way to use the interface inside a method as shown below
		System.out.println("_________________________________");
		outputInfo(person1);
		outputInfo(mach1);
	}

	
	/*
	 * This method takes parameter info of type Info
	 * so it can use the methods available in the Info interface
	 */
		private static void outputInfo(Info info) {
			info.showInfo();
		}

}
