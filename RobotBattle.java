import java.util.Random;
import java.util.Scanner;

public class RobotBattle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int robot1 = 100;
        int robot2 = 100;

        System.out.println("===== ROBOT BATTLE =====");

        while (robot1 > 0 && robot2 > 0) {

            int damage1 = random.nextInt(20) + 1;
            int damage2 = random.nextInt(20) + 1;

            robot2 = robot2 - damage1;
            robot1 = robot1 - damage2;

            System.out.println("Robot 1 Attacked For " + damage1);
            System.out.println("Robot 2 Attacked For " + damage2);

            System.out.println("Robot 1 Health: " + robot1);
            System.out.println("Robot 2 Health: " + robot2);

            System.out.println("--------------------");
        }

        if (robot1 > robot2) {

            System.out.println("Robot 1 Wins!");

        } else {

            System.out.println("Robot 2 Wins!");
        }

        sc.close();
    }
}