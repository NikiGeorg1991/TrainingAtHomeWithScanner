import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Въвете трицифрено число, в което не се сърдъжа НУЛА: ");
        int number = scan.nextInt();

        int b = 0;
        int c = 0;
        int d = 0;

        b = number / 100;
        c = (number / 10) % 10;
        d = (number % 10);
        System.out.println(b + " " + c + " " + d);

        if ((number % b == 0) && (number % c == 0) && (number % d == 0)) {
            System.out.println(" Number се дели на всяко от числата, от които е съставено.");
        }else{
            System.out.println(" Number НЕ се дели на числата, от които е съставено.");
        }


        }
    }
