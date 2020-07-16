import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number A : ");
        int a = scan.nextInt();

        System.out.println("Enter number B : ");
        int b = scan.nextInt();

        if (a==b) {
            System.out.println("The value of number is equals");
        }
            if (a > b) {
                System.out.println(b + " , " + a);
            } else {
                System.out.println(a + " , " + b);

            }
    }
}
