package com.file;

import java.io.File;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj= new File("C:\\Users\\Administrator\\Desktop\\Filereadex.txt");
		if(obj.exists()) {
			System.out.println("File name "+ obj.getName());
			System.out.println("Absolute path "+ obj.getAbsolutePath());
			System.out.println("Writeable "+obj.canWrite());
			System.out.println("Readable "+obj.canRead());
			System.out.println("File size in bytes "+obj.length());
		}
		else {
			System.out.println("This does not exist");
		}
	}

}
