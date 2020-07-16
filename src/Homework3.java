import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of the number A : ");
        int a = scan.nextInt();

        System.out.println("Enter the value of the number B : ");
        int b = scan.nextInt();

        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println(" A = " + a);

        System.out.println(" B = " + b);




    }


}
