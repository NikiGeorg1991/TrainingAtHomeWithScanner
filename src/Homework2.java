import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Въведете числото А: ");
        int a = scan.nextInt();

        System.out.println("Въведете числото В: ");
        int b = scan.nextInt();

        int suma = a + b;
        int razlika = a - b ;
        int proizvedenie = a * b;
        int delenie = a / b ;
        int ostatyk = a % b ;

        System.out.println(" Sumata е " + suma);
        if (razlika>0) {
            System.out.println(" Razlikata е " + razlika);
        }
        else {
            System.out.println(" Razlikata е " + (razlika-razlika-razlika));
        }
        System.out.println(" Proizvedenieto е " + proizvedenie);
        System.out.println(" Delenieto е " + delenie);
        System.out.println(" Ostatyka е " + ostatyk);


        System.out.println("Въведете числото Х: ");
        double x = scan.nextDouble();

        System.out.println("Въведете числото Y: ");
        double y = scan.nextDouble();

        double total = x + y;
        double difference  = x - y ;
        double product = x * y;
        double divisible = x / y ;
        double modulnoDelenie = x % y ;

        System.out.println(" Total is " + total);
        if (difference>0) {
            System.out.println(" Difference is " + difference);
        }
        else {
            System.out.println(" Difference is " + (difference-difference-difference));
        }
        System.out.println(" Product is " + product);
        System.out.println(" Divisible  is " + divisible);
        System.out.println(" Delenieto s ostatyk is " + modulnoDelenie);


    }
}
