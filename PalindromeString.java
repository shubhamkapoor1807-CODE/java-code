import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String original;
        String reverse = "";

        System.out.println("===== PALINDROME STRING =====");

        System.out.print("Enter String: ");
        original = sc.nextLine();

        for (int i = original.length() - 1; i >= 0; i--) {

            reverse = reverse + original.charAt(i);
        }

        System.out.println("Reverse String = " + reverse);

        if (original.equals(reverse)) {

            System.out.println("It Is Palindrome");

        } else {

            System.out.println("It Is Not Palindrome");
        }

        sc.close();
    }
}