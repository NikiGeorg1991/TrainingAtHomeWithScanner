import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a hour of the daytime: ");
        int hour = scan.nextInt();
        if (hour >= 0 && hour < 4) {
            System.out.println("Good evening");
        }
        if (hour >= 18 && hour < 24) {
            System.out.println("Good evening");
        }
        if (hour > 9 && hour < 18) {
            System.out.println("Good afternoon");
        }
        if (hour >= 4 && hour <= 9) {
            System.out.println("Good morning");
        }
    }
}