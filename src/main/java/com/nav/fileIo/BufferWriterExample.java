package com.nav.fileIo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferWriterExample {
	public static void main(String[] args) throws IOException {
		File f=new File("azmat.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
//		BufferedWriter bw = new BufferedWriter(
//							new FileWriter("azmat.txt"));
		bw.write("Hello");
		bw.newLine();
		bw.write("I am azmat ");

		bw.close();
	}
}
