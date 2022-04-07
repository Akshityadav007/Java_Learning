package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {
		try {
			File myFile = new File("sample.txt");
			if(myFile.createNewFile()) {
				System.out.println("The file " + myFile.getName() + " has been created");
			}
			else {
				System.out.println("File already exists!");
			}
		}
		catch(IOException e) {
			System.out.println("Some error occured");
			e.printStackTrace();
		}
	}
}
