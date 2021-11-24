package generics;

import java.util.ArrayList;

public class UseOrArryaList {
	public static void main(String[] args) {
//		////Old way before java5///////
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("Oranges");
//		This had to be casted to get output
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
//		New system
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("dog");
		array.add("cat");
//		casting is not requried
		String animal = array.get(0) ;
		System.out.println(animal);
	}
}
