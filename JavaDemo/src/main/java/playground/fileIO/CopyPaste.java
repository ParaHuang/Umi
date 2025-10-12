package playground.fileIO;

import java.io.*;

public class CopyPaste {
    public static void main(String[] args, Runnable runnable) throws IOException {
        // Path: C:\Users\Ümit\Desktop\git_jetbrains\intellij\Umi\JavaDemo\src\main\java\playground\fileIO

        String path = "C:\\Users\\Ümit\\Desktop\\git_jetbrains\\intellij\\Umi\\JavaDemo\\src\\main\\java\\playground\\fileIO\\any.txt";

        File file = new File(path);

        InputStream in = new FileInputStream(file);

        byte[] bs = in.readAllBytes();


        String path2 = "C:\\Users\\Ümit\\Desktop\\git_jetbrains\\intellij\\Umi\\JavaDemo\\src\\main\\java\\playground\\fileIO\\anyCopied.txt";

        OutputStream out = new FileOutputStream(path2, true);


        out.write("\r\nSomething to Copy".getBytes());


        out.close();
        in.close();
        runnable.run();

        file.delete();
    }
}
