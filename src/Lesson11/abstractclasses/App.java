package Lesson11.abstractclasses;

public class App {
	public static void main(String[] args) {
		Camera camera1 = new Camera();
		Car car1 = new Car();

		camera1.setId(1);
		car1.setId(2);
		
//		This worn't work
//		Machine machine1 = new machine();
		car1.run();
		camera1.start();
	}
}
