package playground.fileIO;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //learning OutputStream
        // Path: C:\Users\Ümit\Desktop\git_jetbrains\intellij\Umi\JavaDemo\src\main\java\playground\fileIO

        String path = "C:\\Users\\Ümit\\Desktop\\git_jetbrains\\intellij\\Umi\\JavaDemo\\src\\main\\java\\playground\\fileIO\\any.txt";

        OutputStream out = new FileOutputStream(path, true);

        out.write("\r\nany other content".getBytes());

        out.close();

        //learning InputStream

        InputStream in = new FileInputStream(path);

        byte[] bs = in.readAllBytes();

        String msg = new String(bs);
        System.out.println("The content we read is: " +msg);

        in.close();

    }
}
