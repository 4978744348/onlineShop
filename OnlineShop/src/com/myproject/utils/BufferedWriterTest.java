package com.myproject.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class BufferedWriterTest {
	
	public static void main(String[] args){
		
	BufferedWriter writer = null;
	try{
		File file = new File("C:/foto/testWriteBuf.txt");
		OutputStream os = new FileOutputStream(file);
		writer = new BufferedWriter(new OutputStreamWriter(os));
		writer.write("Hello buf!!");
		writer.newLine();
		System.out.println("write oK! : " + writer);
	}catch(IOException e){
		e.printStackTrace();
	}finally {
		try{
			if(writer != null){
				writer.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	}

}
