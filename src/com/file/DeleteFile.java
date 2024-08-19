package com.file;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj= new File("C:\\Users\\Administrator\\Desktop\\code1.txt");
		if(obj.delete()) {
			System.out.println("dELETED "+ obj.getName());
		}
		else {
			System.out.println("Failed to delete");
		}
	}

}
