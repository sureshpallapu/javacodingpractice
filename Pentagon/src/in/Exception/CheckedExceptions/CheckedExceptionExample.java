package in.Exception.CheckedExceptions;

import java.io.*;

public class CheckedExceptionExample {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("file.txt"); // File might not exist
			BufferedReader br = new BufferedReader(file);
			System.out.println(br.readLine());
			br.close();
		} catch (IOException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}
}
