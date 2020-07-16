import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number A: ");
        int a = scan.nextInt();
        System.out.println("Enter the number B: ");
        int b = scan.nextInt();

        if (((a < 10) || (a > 99)) || ((b < 10) || (b > 99))) {
            System.out.println("The numbers are invalid");
        } else {
            if ((a * b) % 2 == 0) {
                System.out.println("Произведението е " + a * b + " последната цифра е " + (a * b) % 10 + ", числото е четно.");
            } else {
                if ((a * b) % 2 == 1) {
                    System.out.println("Произведението е " + a * b + " последната цифра е " + (a * b) % 10 + ", числото е НЕчетно.");
                }
            }
        }
    }
}
