package Lesson12.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
	public static void main(String[] args) {
		File file1 = new File("D:\\java_selenium"
				+ "\\javaTrainingUdemy\\src\\Lesson12\\filereaders\\testReader.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file1))){
			String line;
			
			while((line = br.readLine())!=null) {
			System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: "+ file1.toString());
			
		} catch (IOException e) {
			System.out.println("Unable to read file: "+ file1.toString());
		}
	}
}
