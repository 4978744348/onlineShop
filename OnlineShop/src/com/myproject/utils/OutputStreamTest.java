package com.myproject.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class OutputStreamTest {
	
	public static void main(String[] args){
	OutputStream os = null;
	try{
		File file = new File("C:/foto/testWrite.txt");
		os = new FileOutputStream(file);
		byte[] buffer = "Hello!".getBytes();
		os.write(buffer);
		System.out.println("writed ok!: " + os);
	}catch (IOException e){
		e.printStackTrace();
	}finally {
		try{
		if(os != null){
		os.close();
		}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	}
	

}
