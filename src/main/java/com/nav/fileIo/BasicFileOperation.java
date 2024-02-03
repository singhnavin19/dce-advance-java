package com.nav.fileIo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BasicFileOperation {
	public static void main(String[] args) throws IOException {
		File f=new File("laxmi.txt");
		FileWriter fw=new FileWriter(f,true);
		
		fw.write("Hello Laxmi\n");
		fw.write("Laxmi1");
		
		fw.close();
		
		
//		getFiilesName("abc");

	}

	private static void getFiilesName(String name) {
		File f1 = new File(name);
		for (File f : f1.listFiles()) {
			if (f.isFile()) {
				System.out.println("file name is ** " + f.getName());
			} else {
				getFiilesName(f.getAbsolutePath());
				System.out.println("directory or folder # " + f.getName());
			}
		}
	}
}
