package serializationofArray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading objects..");
		
		
		
		try(FileInputStream fi = new FileInputStream("D:\\java_selenium\\javaTrainingUdemy\\src\\"
				+ "serializationofArray\\array.bin")){
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Person [] people = (Person[])oi.readObject();
			ArrayList<Person> peopleList = (ArrayList<Person>)oi.readObject();
			
//			TYpe Person having variable x and iterate people array
			for(Person x:people) {
				System.out.println(x);
			}
			
			for (Person y:peopleList) {
				System.out.println("Arraylist value is: "+ y);
			}
			oi.close();
			
			System.out.println("Reading compelted");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
