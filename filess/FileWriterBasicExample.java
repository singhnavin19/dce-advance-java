package filess;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBasicExample {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("reshma3.txt",true);
        fileWriter.write("\nHello1,My first File");
        fileWriter.write(String.valueOf(66));
        fileWriter.close();
    }
}
