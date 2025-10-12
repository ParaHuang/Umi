package day14_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main1 {
    public static void main(String[] args) throws IOException {
        //action        read        write
        //stream        input       output

        //different type of operation:  byte(all files)    or      character(text file)

        //write
        //as byte   ->  OutputStream
        //1.create an OutputStream object based the file
        //  /Users/parahuang/Downloads/happyFolder/hello.txt
        String path = "/Users/parahuang/Downloads/happyFolder/hello.txt";
        OutputStream out = new FileOutputStream(path,true);

        //2.write content into the target file by stream
        out.write("\r\nhello".getBytes());

        //3.close the stream
        out.close();

    }
}
