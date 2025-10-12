package playground.recursion.folder;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Ümit\\Desktop\\git_jetbrains\\intellij\\Umi\\JavaDemo\\src\\main\\java\\playground\\recursion\\folder\\folder2");
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
}
