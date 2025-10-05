package day13_file;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        //1.    accessing file
        //2.    accessing the content of file


        //1. get/create the object of a certain file
        File file = new File("/Users/parahuang/Downloads/happyFolder");
        //file.listFiles() -> open the folder, seeing all the file inside as an array
        File[] fs = file.listFiles();
        for (File f : fs) { //looping the array, which is checking every file 1 by 1
            if (f.isFile() && f.getName().endsWith(".txt")) {
                System.out.println(f.getName());
            } else if (f.isDirectory()) {//it's a folder
                //open the folder, seeing all the file inside as an array
                File[] folders = f.listFiles();
                for (File f1 : folders) {//looping the array, which is checking every file 1 by 1
                    if (f1.isFile() && f1.getName().endsWith(".txt")) {//print the name if it's txt
                        System.out.println(f1.getName());
                    } else if (f1.isDirectory()) {
                        //open the folder, seeing all the file inside as an array
                        File[] folder2s = f1.listFiles();
                        for (File f3 : folder2s) {
                            //.........
                        }
                    }
                }
            }
        }
    }
}
//file uploading

//find all the text file under a specific folder, and print their names
//and in the end,print how many there are