package Lesson12.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
/*
 * Older java implementation
 */

class App{
	public static void main(String[] args) {
		File file = new File("D:\\java_selenium"
				+ "\\javaTrainingUdemy\\src\\Lesson12\\filereader\\testReader.txt");
		
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line;
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: "+ file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file "+ file.toString());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Unable to close file: "+ file.toString());
			} catch(NullPointerException ex) {
				// File was not found or opened
			}
		}
	}
}

