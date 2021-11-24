package handlingexceptions.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
public static void main(String[] args) {
	File file1 = new File("test.txt");
	try {
		FileReader fr = new FileReader(file1);
//		This will not be executed if exception is thrown
		System.out.println("Executing ............");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Error: File not found: "+file1.toString());
	}
	
	System.out.println("This is printed as the exception was caught and handled");
}
}
