import java.util.Scanner;

public class VotingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.println("===== VOTING SYSTEM =====");

        System.out.print("Enter Your Age: ");
        age = sc.nextInt();

        if (age >= 18) {

            System.out.println("You Are Eligible To Vote");

        } else {

            System.out.println("You Are Not Eligible To Vote");
        }

        sc.close();
    }
}