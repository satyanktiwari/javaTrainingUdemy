package inheritance;

/*
 * Object class is the ultimate ancestor of any class
 * So eventhough your class might not be having any methods
 * but when you do a car.(dot) you'll be able to see few
 * methods which are inheritied by any class from the 
 * Object Class of Java.
 * few e.g.'s are the .equals(), .hashCode()
 * 
 * */
public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		machine1.start();
		machine1.stop();
		/*
		 * Once you use the extends keyword in the class Car All the methods available
		 * in the class machine are now available in the class car
		 */
		Car car1 = new Car();
		/*
		 *Since the start method is overridden in the Car class
		 *now the message would be Car started instead of the Machine started 
		 */
		car1.start();
		car1.stop();
		car1.wipeWindShield();
		car1.showInfo();
	}
}
