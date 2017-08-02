package com.myproject.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest {
	
	public static void main(String[] args){
	
	BufferedReader reader = null;
	try{
		File file = new File("C:/foto/test.txt");
		InputStream inputStream = new FileInputStream(file);
		reader = new BufferedReader(new InputStreamReader(inputStream));
		while(reader.ready()){
			String line = reader.readLine();
			System.out.println("out: " + line);
		}
	}catch (IOException e){
		e.printStackTrace();
	}finally{
		try{
			if(reader != null){
				reader.close();
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	}

}
