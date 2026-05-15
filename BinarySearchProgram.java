import java.util.Scanner;

public class BinarySearchProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("===== BINARY SEARCH =====");

        System.out.print("Enter Number To Search: ");
        int target = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;

        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {

                System.out.println("Element Found At Position: " + mid);
                found = true;
                break;

            } else if (arr[mid] < target) {

                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        if (!found) {

            System.out.println("Element Not Found");
        }

        sc.close();
    }
}