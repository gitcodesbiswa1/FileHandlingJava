package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter obj= new FileWriter("C:\\Users\\Administrator\\Desktop\\Filereadex.txt");
			obj.write("Welcome to micron technologies! All the best for learning");
			obj.close();
			System.out.println("Successfully wrote to the file");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
