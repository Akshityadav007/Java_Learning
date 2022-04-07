package fileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		try {
			File myFile = new File("sample.txt");
			if(myFile.delete()) {
				System.out.println("The file " + myFile.getName() + " has been deleted.");
			}
			else {
				System.out.println("Failed to delete the file.");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
