package Lesson10.handlingexceptions.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
public static void main(String[] args) {
	File file1 = new File("test.txt");
	try {
		FileReader fr = new FileReader(file1);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
