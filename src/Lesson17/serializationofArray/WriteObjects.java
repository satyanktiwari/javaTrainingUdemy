package Lesson17.serializationofArray;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("writing object..");
		
		Person[] people = {new Person(75,"smith"),new Person(76,"Tong"),
				new Person(77,"Dale")};
		
		ArrayList<Person> peopleList = new ArrayList(Arrays.asList(people));
		
		try(FileOutputStream fs = new FileOutputStream("D:\\java_selenium\\javaTrainingUdemy\\src\\"
				+ "Lesson17\\serializationofArray\\array.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(people);
			os.writeObject(peopleList);
			os.close();
			System.out.println("Writing Finished");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
