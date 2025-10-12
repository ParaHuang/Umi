package day14_file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        //character stream
        FileWriter writer = new FileWriter("/Users/parahuang/Downloads/happyFolder/hello.txt",true);
        writer.write("你好，乌米");
        writer.flush();     //extra code of character stream
        writer.close();
    }
}
