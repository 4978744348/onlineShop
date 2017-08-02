package com.myproject.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamTest {
	
	public static void main(String[] args){
	
	InputStream inputStream = null;
	try{
		File file = new File("C:/foto/test.txt"); 
		inputStream = new FileInputStream(file);
		byte[]buffer = new byte[20];
		while(inputStream.available() > 0){
			int readBytes = inputStream.read(buffer);
			System.out.println("readBytes: " + readBytes);
			System.out.println(Arrays.toString(buffer));
		}
	}catch (IOException e){
		e.printStackTrace();
	}finally{
		try{
			if(inputStream != null){
		inputStream.close();
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	}

}
