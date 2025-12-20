package filess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBasicExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("reshma3.txt");
        int r=fileReader.read();
        while (r!=-1){
            System.out.print((char)r);
            r=fileReader.read();
        }
    }
}
