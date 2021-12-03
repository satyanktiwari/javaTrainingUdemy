package Lesson14.compareobjects;

public class App {
	public static void main(String[] args) {
		String value1 = "hello";
		String value2 = "helloabcd".substring(0,5);
		System.out.println("value2 is: "+value2);
		System.out.println(value1 == value2);
		System.out.println("Using dot equals both are found to be same "
				+ ""+value1.equals(value2));
	}
}
