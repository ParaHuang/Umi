package day14_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;

public class Main5 {
    public static void main(String[] args) throws IOException {
        //tool for something
        //Arrays            ->  array
        //Collections       ->  Collection
        //Files             ->  File
        //Paths             ->  Path
        Files.lines(Paths.get("/Users/parahuang/Downloads/happyFolder/hello.txt"))
                .forEach(s->System.out.println(s));

                


//                .forEach(new Consumer<String>() {
//                    @Override
//                    public void accept(String s) {
//                        System.out.println(s);
//                    }
//                });




//                .forEach(line-> System.out.println(line));


    }
}
