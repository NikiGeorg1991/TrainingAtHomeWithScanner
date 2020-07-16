import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("The value of a : ");
        double a = scan.nextDouble();

        System.out.println("The value of b : ");
        double b = scan.nextDouble();

        System.out.println("The value of c : ");
        double c = scan.nextDouble();

        double x = 0;

        x = a;
        a=b;
        b=c;
        c=x;


        System.out.println(a + " , " + b + " , " + c);

    }
}
