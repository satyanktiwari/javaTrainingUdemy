package filewriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		File file1 = new File("D:\\java_selenium\\javaTrainingUdemy\\src\\filewriter\\test.txt");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file1))){
			br.write("One");
			br.newLine();
			br.write("Two");
			br.newLine();
			br.write("Last");
			br.newLine();
			System.out.println("Printing done.Closing program now...");
		} catch (IOException e) {
			System.out.println("Unable to write to file"+ file1.toString());
		}
		
	}

}
