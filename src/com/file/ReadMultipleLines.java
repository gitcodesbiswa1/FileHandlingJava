package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMultipleLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File obj= new File("C:\\Users\\Administrator\\Desktop\\Filereadex.txt");
			Scanner sc= new Scanner(obj);
			
			while(sc.hasNextLine()) {
				String data= sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		}catch(FileNotFoundException e) {
			System.out.println("An error ocurred");
			e.printStackTrace();
		}
	}

}
