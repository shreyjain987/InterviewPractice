package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadLogFileWithError {
	public void readLog() {
		try {
			FileInputStream fstream = new FileInputStream("\\Users\\shrey_jain\\Desktop\\logfile.log");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			/* read log line by line */
			while ((strLine = br.readLine()) != null) {
				/* parse strLine to obtain what you want */
				System.out.println(strLine);
			}
			fstream.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		int count = 0;
		File file = new File("\\Users\\shrey_jain\\Desktop\\logfile.log");

		Scanner sc = new Scanner(file);
		sc.useDelimiter(",|\r\n");
		System.out.println(sc.next());
		while (sc.hasNext()) {
			System.out.println(sc.next());
//			if (sc.next().contains("ERROR")) {
//				count = count + 1;
//			}
			
		}
		System.out.println(count);
		// closing the scanner stream
		sc.close();
	}
}
