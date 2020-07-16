import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter four digit number : ");
        int number = scan.nextInt();
        if ((number < 1000) || (number > 9999)) {
            System.out.println("The number is invalid");
        }
        else {
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int ad = 0;
            int bc = 0;

            a = number / 1000;
            b = ((number / 100) % 10);
            c = (number % 100) / 10;
            d = (number % 10);
            ad = a * 10 + d;
            bc = b * 10 + c;

            if (ad > bc) {
                System.out.println("Първото число е по-голямо , числата са " + ad + " и " + bc);
            }
            if (bc > ad) {
                System.out.println("Второто число е по-голямо , числата са " + ad + " и " + bc);
            }
            if (ad == bc) {
                System.out.println("Числата са равни и са " + ad + " и " + bc);
            }

        }
    }
}
