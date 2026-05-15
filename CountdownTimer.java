public class CountdownTimer {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("===== COUNTDOWN TIMER =====");

        for (int i = 10; i >= 1; i--) {

            System.out.println(i);

            Thread.sleep(1000);
        }

        System.out.println("Time Up");
    }
}