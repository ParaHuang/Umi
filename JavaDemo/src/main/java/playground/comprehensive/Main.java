package playground.comprehensive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        List<Student> students = new ArrayList<>();


        while (true) {
            System.out.println("Choose the Options");
            System.out.println("1. Add a Student");
            System.out.println("2. Query all the student");
            System.out.println("3. Query all the students by id");
            System.out.println("4. Remove a Student");
            int choice = input.nextInt();



            switch (choice) {

                case 1:
                    System.out.println("Please enter every information of student");
                    // TODO: Einzelne Beschreibungen zum Inout hinzufügen
                    int id = input.nextInt();
                    String name = input.next();
                    int age  = input.nextInt();
                    String gender  = input.next();
                    int height  = input.nextInt();

                    Student student = new Student(id, name, age, gender, height);

                    boolean exists = false;

                    for (Student s : students) {
                        if (s.getId() == id) {
                            exists = true;
                            System.out.println("Student ID: " + s.getId() + "is already in the System");
                            break;
                        }


                    }
                    if (!exists) {
                        students.add(student);
                    }

                    break;
                case 2:
                    System.out.println(students);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    return;
            }


        }

    }
}
