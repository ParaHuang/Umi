package day14_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/Users/parahuang/Downloads/happyFolder/hello.txt");
        StringBuffer buffer = new StringBuffer("");
        //create a char array
        char[] cs = new char[64];
        /*
        //read content from file by characters from file,save them in char array
        reader.read(cs);    //read 64 characters from file, return the actual amount of characters it reads,return -1 if there is nothing left
        buffer.append(cs);

        reader.read(cs);    //old characters will be replaced by new characters
        buffer.append(cs);
        */
        int len;
        while (    (len = reader.read(cs))  != -1   ){
            buffer.append(cs,0,len);
        }


        System.out.println(buffer);
        reader.close();
    }
}
//64,54
