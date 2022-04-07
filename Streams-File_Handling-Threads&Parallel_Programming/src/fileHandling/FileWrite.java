package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		try {
			FileWriter w = new FileWriter("sample.txt");
			w.write("This is sample text for the file!");
			w.close();
			System.out.println("File has been successfully written!");			
		}
		catch(IOException e) {
			System.out.println("Some error occured");
			e.printStackTrace();
		}
	}

}
