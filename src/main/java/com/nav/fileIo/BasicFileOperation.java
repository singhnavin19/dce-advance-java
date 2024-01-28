package com.nav.fileIo;

import java.io.File;
import java.io.IOException;

public class BasicFileOperation {
	public static void main(String[] args) throws IOException {
		File f1=new File("abc");
		
		for(File f:f1.listFiles()) {
			System.out.println("files are "+f.getName());
		}
		
	}
}
