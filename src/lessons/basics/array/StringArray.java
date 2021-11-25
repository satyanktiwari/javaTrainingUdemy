package lessons.basics.array;

public class StringArray {
	public static void main(String[] args) {

		String [] fruits = {"apple","mango","kiwi"};
/*		 declare a varaible e.g.'nameOfFruit' of type String.
 * 		Then java will set this variable to each 
 		of the values in array fruits
		use the variable nameOfFruit to print.
 * */
		for(String nameOfFruit:fruits) {
			System.out.println(nameOfFruit);
		}
		
	}

}
