package com.file;

import java.io.File;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myObj= new File("C:\\Users\\Administrator\\Desktop\\code1.txt");
			
			if(myObj.createNewFile()) {
				System.out.println("File Created: "+myObj.getName());
				System.out.println("Absolute path: "+myObj.getAbsolutePath());
			}
			else {
				System.out.println("File already exists");
			}
		}catch(Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
