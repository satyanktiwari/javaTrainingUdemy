package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading objects..");
		
		try(FileInputStream fi = new FileInputStream("D:\\java_selenium\\javaTrainingUdemy"
				+ "\\src\\serialization\\people.bin")){
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Person person1 = (Person) oi.readObject();
			Person person2 = (Person) oi.readObject();
			
			System.out.println("First object written to file was: "+ person1);
			System.out.println("Second object written to file was: "+ person2);
			
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
