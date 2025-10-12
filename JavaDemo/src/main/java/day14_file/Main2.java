package day14_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main2 {
    public static void main(String[] args) throws IOException {
        //1.create InputStream object based on a file path
        InputStream in = new FileInputStream("/Users/parahuang/Downloads/happyFolder/hello.txt");
        //2. read content, having a byte array to keep all the content as bytes
        byte[] bs = in.readAllBytes();      //when file is < 100MB , it's safe
        //3. change byte[] into text
        String msg = new String(bs);
        System.out.println("the content we read is:\n"+msg);
        //4. close stream
        in.close();


    }
}
//copy,paste