import java.util.Scanner;

public class HotelBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] rooms = {
            "Available",
            "Available",
            "Available"
        };

        System.out.println("===== HOTEL BOOKING =====");

        for (int i = 0; i < rooms.length; i++) {

            System.out.println(
                "Room " + (i + 1) + " : " + rooms[i]
            );
        }

        System.out.print("Enter Room Number To Book: ");
        int room = sc.nextInt();

        if (room >= 1 && room <= 3) {

            if (rooms[room - 1].equals("Available")) {

                rooms[room - 1] = "Booked";

                System.out.println("Room Booked Successfully");

            } else {

                System.out.println("Room Already Booked");
            }

        } else {

            System.out.println("Invalid Room Number");
        }

        sc.close();
    }
}