package lessons.basics.constructors;



class Machine{
	public String name;
	public int code;
//	1. Constructor has the same name as the class
//	2. hence can be upper case to begin with
//	3. It is always run
	/*
	 *A constructor can call another constructor
	 *by using the this keyword
	 *it should be called as the first line within the calling constructor
	 * As shown below in constructors one and two
	 * 
	 * */
	public Machine() {
		this("Cynthia");
		System.out.println("This is the first construtor");
	}
	
//	We can have multiple constructors but should have different set of parameters
	public Machine(String name) {
		this("Tennis",32);
		this.name =name;
		System.out.println("This is the 2nd construtor");
	}
	
	public Machine(String name, int code) {
		this.name=name;
		this.code=code;
		System.out.println("This is the 3rd construtor");
	}
}


public class ConstructorsTutorial {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
//		Machine machine2= new Machine("Toad");
//		Machine machine3 = new Machine("Terry",8);
	}
	
}
