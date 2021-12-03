package Lesson07.upcastingAndDowncasting;

class Machine{
	public void start() {
		System.out.println("Machine started...");
	}
}

class Camera extends Machine{
	public void start() {
		System.out.println("Camera started");
	}
	public void snap() {
		System.out.println("Photo taken");
	}
	
}

public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
//		Upcasting
//		machine2 variable is pointing to camera1 variable which refrences object new Camera().
		Machine machine2 = camera1;
//		This will access start method fo camera
		machine2.start();
//		upcasting is safe, guaranteed by polymorphisom
		
		
//		Downcasting
		System.out.println("*******"+ "downcasting"+"*****");
		Machine machine3 = new Camera();
//		This will need to be casted to type camera to explicitly say that you want to convert.
//		Camera camera2 = machine3;
		Camera camera2 = (Camera) machine3;
		camera2.start();
		camera2.snap();
		
//		this won't work --> runtime error
		Machine machine4 = new Machine();
		Camera camera3 = (Camera)machine4;
		camera3.start();
		camera3.snap();
	}
}
