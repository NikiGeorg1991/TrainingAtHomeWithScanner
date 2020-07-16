import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Въведете А: ");
        double a = scan.nextDouble();

        System.out.println("Въведете B: ");
        double b = scan.nextDouble();

        System.out.println("Въведете C: ");
        double c = scan.nextDouble();

        if (((c>a)&&(c<b))||((c>b)&&(c<a))){
            System.out.println("Числото C е между числата А и В");
        }
        else{
            System.out.println("Числото C не е между числата А и В");

        }
    }
}
