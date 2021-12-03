package Lesson18.enumbasicsandadvanced;

public class Apps {
	public static void main(String[] args) {
		Animals animal = Animals.Dog;
		
		switch (animal) {
		case Cat:
			System.out.println("Cat");
			break;
		case Dog:
			System.out.println("Dog..");
			break;
		case Mouse:
			break;
		default:
			break;
		
		}
		
		System.out.println(Animals.Cat.getName());
		System.out.println(Animals.Dog);
		
	}
}
