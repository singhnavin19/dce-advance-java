package filess;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffrWriterBasicExample {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("niralaJi.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello I am bufferWroiter");
        bufferedWriter.flush();
        bufferedWriter.newLine();
        bufferedWriter.write("Bye Bye");
        bufferedWriter.close();
        System.out.println(Thread.currentThread().getName());



    }
}
