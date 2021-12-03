package Lesson05.interfaces;

public class Machine implements Info {
	private int id=7;
//	start method for the Machine class
	public void start() {
		System.out.println("Machine is starting...");
	}
// Method implementation from the interface.
	public void showInfo() {
		System.out.println("My id is: "+ id);
	}
	
	
}
