package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		try {
			File myFile = new File("sample.txt");
			Scanner sc = new Scanner(myFile);
			System.out.println("The file reads... \n");
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
			System.out.println("\nFile has been read successfully!");
		}
		catch(FileNotFoundException e) {
			System.out.println("Some error orccured");
			e.printStackTrace();
		}
	}

}
