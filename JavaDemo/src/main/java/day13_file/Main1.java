package day13_file;

import java.io.File;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        //1.    accessing file
        //2.    accessing the content of file


        //1. get/create the object of a certain file
        File file = new File("C:\\Users\\Ümit\\Desktop\\git_jetbrains\\intellij\\Umi\\JavaDemo\\src\\main\\java\\day13_file\\folder");
//        File newFile = new File("/Users/parahuang/Downloads/happyFolderWithNewName");

        //2. get name,path,parent
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getParent());


        //3. delete
        //file.delete();

        //4. create
        //create a file when it doesn't exist
//        if(!file.exists())
//            file.createNewFile();
        //create a folder when it doesn't exist
//        if(!file.exists())
//            file.mkdir();

        //5. rename
//        file.renameTo(newFile);

        //6. get all sub files inside a folder
        File[] fs = file.listFiles();
        for (File f:fs){
            System.out.println(f.getName()+"--"+f.isFile());
        }
    }
}

//file uploading

//find all the text file under a specific folder, and print their names
//and in the end,print how many there are