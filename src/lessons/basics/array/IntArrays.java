package lessons.basics.array;

public class IntArrays {

	public static void main(String[] args) {
//		int value =7;
//		Declaring an array with reference 
//		variable called values
		int[] values;
//		Create an array that can hold 3 integers
		values = new int[3];
//		Assign value
		values[0]=10;
		values[1]=20;
		values[2]=30;
		for(int x=0; x<values.length;x++)
		{
			System.out.println(values[x]);
		}
//		Declaring and assigning value at the same time
		int [] numbers = {1,2,3,4};
		for(int i=0; i<numbers.length;i++) {
			System.out.println("i is: "+numbers[i]);
		}

}
}
