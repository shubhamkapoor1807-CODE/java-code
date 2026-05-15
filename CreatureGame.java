import java.util.Scanner;

class Creature {

    String name;
    int power;
    int health;

    Creature(String n, int p, int h) {

        name = n;
        power = p;
        health = h;
    }

    void display() {

        System.out.println("\n===== CREATURE DETAILS =====");
        System.out.println("Name   : " + name);
        System.out.println("Power  : " + power);
        System.out.println("Health : " + health);
    }

    void attack() {

        System.out.println(name + " attacks with power " + power);
    }
}

public class CreatureGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CREATE YOUR CREATURE =====");

        System.out.print("Enter Creature Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Creature Power: ");
        int power = sc.nextInt();

        System.out.print("Enter Creature Health: ");
        int health = sc.nextInt();

        Creature c1 = new Creature(name, power, health);

        c1.display();

        System.out.println("\n===== BATTLE =====");
        c1.attack();

        sc.close();
    }
}