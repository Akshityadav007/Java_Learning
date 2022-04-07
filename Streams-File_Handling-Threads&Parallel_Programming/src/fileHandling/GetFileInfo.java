package fileHandling;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {
		try {
			File myFile = new File("sample.txt");
			if(myFile.exists()) {
				System.out.println("The file name: " + myFile.getName());
				System.out.println("The file path: " + myFile.getAbsolutePath());
				System.out.println("Is the file writable? " + myFile.canWrite());
				System.out.println("Is the file readable? " + myFile.canRead());
				System.out.println("File's size in bytes: " + myFile.length());
			}
			else {
				System.out.println("The file doesn't exist!");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
