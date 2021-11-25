package abstractclasses;

public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Car is starting");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Driving!");
		
	}

	@Override
	public void shutDown() {
		System.out.println("Car ShuttingDown");
		
	}

}
