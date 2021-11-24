package handlingexceptions.demo4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
public static void main(String[] args) {
	try {
		readFile();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("File not found");
	}
	
	System.out.println("This is printed as the exception\n"
			+ "was caught and handled");
}

public static void readFile() throws FileNotFoundException {
	File file1 = new File("test.txt");
	
		FileReader fr = new FileReader(file1);
//		This will not be executed if exception is thrown
		System.out.println("Executing ............");

}
}
