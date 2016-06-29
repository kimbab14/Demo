package com.api.contents;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * The FileReader and FileWriter classes are used for reading 
 * and writing character data from files.
 */
public class FileReaderAndFileWriter {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\jelica60589\\Desktop\\Example.txt");
			BufferedReader br = new BufferedReader(fr);
			String txt = br.readLine();
			while(txt != null){
				String a = txt;
				txt = br.readLine();
				System.out.println(a);
			}
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
