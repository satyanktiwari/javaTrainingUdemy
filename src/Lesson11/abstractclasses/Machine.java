package Lesson11.abstractclasses;
/*
 * to prevent initialisation of the base class
 * abstract keyword can be added
 */
public abstract class Machine {
/*
 * Common functionalities for the child 
 * classes can be 
 * implemented in the base class for e.g ID
 */
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 * If a method is abstract then the
	 *  child classes are forced to implement
	 *  those as below
	 */
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutDown();
	
	public void run() {
		start();
		doStuff();
		shutDown();
	}
}
