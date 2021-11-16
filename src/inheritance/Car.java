package inheritance;

/*
 * New methods can be added even if Car is extending
 * Machine
 * Note: Final classes can't be extended e.g. the String class of java
 * 
 * Using IDE can override by clicking in the body of the class > Rt. Click > Source>
 * Method Override > selec the methods that you want > Click Ok
 * 
 */
public class Car extends Machine {


	public void wipeWindShield() {
		System.out.println("Wiping started");

	}

	/*
	 * Method overriding The header part of the method should be the same e.g lets
	 * override the start method of machine
	 */
	@Override
	public void start() {
		System.out.println("Car Started");
	}
	
	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public void showInfo() {
//		private variables cannot be accessed outside the class	
//		System.out.println(privateString);
		System.out.println(withoutAccessModifier);
		System.out.println(protectedString);
	}
}
