package Lesson18.enumbasicsandadvanced;

public enum Animals {
	Cat("Dual"), Dog("silky"), Mouse("Catty");
	
	private String name;

	Animals(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}
	
/*
 * This can't be generated using the Source option
 * But if the Syntax is known it can be 
 * written as below
 * and this would print the name of the animal
 */
	public String toString() {
		return "This adnimal is called:" + name;
	}
	
}
