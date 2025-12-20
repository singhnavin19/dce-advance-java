package filess;

import java.io.File;
import java.io.IOException;

public class FileBasicExample {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\","priti1.txt");
        System.out.println("f.exists() "+f.exists());
        if(!f.exists()){
            System.out.println("File created ");
            f.createNewFile();
        }
        System.out.println(f);
        System.out.println(f.toString());

        FileBasicExample fileBasicExample=new FileBasicExample();
        System.out.println(fileBasicExample.toString());

    }
}
