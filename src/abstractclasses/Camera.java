package abstractclasses;

public class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Camera starting");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Snap!");
		
	}

	@Override
	public void shutDown() {
		System.out.println("Camera Shutting down");
		
	}

}
