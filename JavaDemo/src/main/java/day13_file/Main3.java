package day13_file;

import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/parahuang/Downloads/happyFolder");
        findTxt(file);
    }
    public static void findTxt(File folder){
        File[] fs = folder.listFiles();
        for(File f:fs){
            if(f.isFile() && f.getName().endsWith(".txt")){
                System.out.println(f.getPath());
            }else if(f.isDirectory()){
                //recursion
                findTxt(f);//call itself
            }
        }
    }


    public static void a(){

    }

    public static void b(){
        //create an object
//        Main3 m = new Main3();
//        m.a();

        a();
    }
}
//file uploading

//find all the text file under a specific folder, and print their names
//and in the end,print how many there are