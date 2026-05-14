import java.util.Scanner;

public class StudentSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT INFORMATION =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        System.out.println("\n===== STUDENT DETAILS =====");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks: " + marks);

        if (marks >= 40) {

            System.out.println("Result: Pass");

        } else {

            System.out.println("Result: Fail");
        }

        sc.close();
    }
}