import java.util.ArrayList;
import java.util.Scanner;

class Student {

    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, marks);
                    students.add(s);

                    System.out.println("Student Added Successfully");
                    break;

                case 2:

                    if (students.size() == 0) {
                        System.out.println("No Students Found");
                    } else {

                        for (Student st : students) {
                            st.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student st : students) {

                        if (st.id == searchId) {
                            st.display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID To Delete: ");
                    int deleteId = sc.nextInt();

                    boolean removed = false;

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).id == deleteId) {
                            students.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Student Deleted");
                    } else {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 5:

                    System.out.println("Program Closed");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}