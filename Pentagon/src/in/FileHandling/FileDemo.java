package in.FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File f = new File(" C:\\Users\\SURESH P\\OneDrive\\Desktop\\FileEx.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		fw.write("This is the first file ");
		fw.close();
		Scanner s = new Scanner(f);
		while (s.hasNextLine()) {
			String ss = s.nextLine();
			System.out.println(s);
		}
	}
}
