package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("writing object..");
		
		Person mike = new Person(5,"Mike");
		Person sue = new Person(6, "Sue");
		
		System.out.println(mike);
		System.out.println(sue);
		
		try(FileOutputStream fs = new FileOutputStream("D:\\java_selenium\\javaTrainingUdemy"
				+ "\\src\\serialization\\people.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(mike);
			os.writeObject(sue);
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
