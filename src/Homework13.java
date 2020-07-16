import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of temperature by C: ");
        int c = scan.nextInt();
        if ((c >= -100) && (c <= 100)) {
            if (c < -20) {
                System.out.println("Ice cold.");
            }
            if (c < 0 && c >= -20) {
                System.out.println("Cold.");
            }
            if (c >= 0 && c < 15) {
                System.out.println("Normal.");
            }
            if (c >= 15 && c < 25) {
                System.out.println("Hot.");
            }
            if (c > 25) {
                System.out.println("Very hot.");
            }
        } else {
            System.out.println("Invalid value.");
        }
    }
}
