import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password;

        System.out.println("===== PASSWORD CHECKER =====");

        System.out.print("Enter Password: ");
        password = sc.nextLine();

        if (password.length() >= 8) {

            System.out.println("Strong Password");

        } else {

            System.out.println("Weak Password");
        }

        sc.close();
    }
}