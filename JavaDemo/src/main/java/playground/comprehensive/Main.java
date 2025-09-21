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
                    System.out.println("ID:");
                    int id = input.nextInt();
                    System.out.println("Name:");
                    String name = input.next();
                    System.out.println("Age:");
                    int age  = input.nextInt();
                    System.out.println("Gender:");
                    String gender  = input.next();
                    System.out.println("height:");
                    int height  = input.nextInt();

                    Student student = new Student(id, name, age, gender, height);

                    boolean exists = false;

                    for (Student s : students) {
                        if (s.getId() == id) {
                            exists = true;
                            System.out.println("Student ID: " + s.getId() + " is already in the System");
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
                    System.out.println("Pls enter a Students ID");

                    int searchID = input.nextInt();
                    boolean existID = false;

                    for (Student s : students) {
                        if (s.getId() == searchID) {
                            existID = true;
                            System.out.println("Student ID: " + s.getId() + "it exists in the System");
                            break;
                        }


                    }
                    if (!existID) {
                        System.out.println("Student ID: " + searchID + " does not exist in the System");
                    }
                    break;
                case 4:
                    System.out.println("Pls enter a Students ID");

                    int deleteID = input.nextInt();
                    boolean dexistID = false;

                    for (Student s : students) {
                        if (s.getId() == deleteID) {
                            dexistID = true;
                            //System.out.println("Student ID: " + s.getId() + "it exists in the System");
                            students.remove(s);
                            break;

                        }


                    }
                    if (!dexistID) {
                        System.out.println("Student ID: " + deleteID + " does not exist in the System");
                    }
                    break;
                default:
                    System.out.println("Thank you for using this program");
                    return;
            }


        }

    }
}
