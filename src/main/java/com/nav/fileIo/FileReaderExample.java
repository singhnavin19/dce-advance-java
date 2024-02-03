package com.nav.fileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		File f=new File("azmat.txt");
		FileReader f1=new FileReader(f);
		
		BufferedReader br=new BufferedReader(f1);
		
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());

		//		
//		int i=f1.read();
//		
//		while(i!=-1) {
//			System.out.print((char)i);
//			i=f1.read();
//		}		
//		f1.close();
		
	}
}
