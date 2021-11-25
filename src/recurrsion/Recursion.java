package recurrsion;

public class Recursion {
	public static void main(String[] args) {
		System.out.println("Factorial is: "+factorial(5));
	}
	
	private static int factorial(int value) {
		System.out.println("Value is now: "+ value);
		if(value == 1) {
//			this is requried to break the loop
//			Otherwise would give stackoverflow error
			return 1;
		} 
		return factorial(value-1)*value;
		
	}
		
}
