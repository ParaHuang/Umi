package playground.studentsandfiles;

import day5_oop.encapsulation.Student;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("C:\\Users\\Ümit\\Desktop\\git_jetbrains\\intellij\\Umi\\JavaDemo\\src\\main\\java\\playground\\studentsandfiles\\info.txt"))
                .forEach(s->{
                    //ID, Name, Age, Gender
                    String [] split = s.split(",");
                    int ID=Integer.parseInt(split[0]);
                    String name=split[1];
                    int age=Integer.parseInt(split[2]);
                    String gender=split[3];

                    Student student = new Student(ID,name,age,gender);

                    System.out.println(student);
                });


    }
}
