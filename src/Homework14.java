import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 8");
        int r = scan.nextInt();
        System.out.println("Enter a number between 1 to 8");
        int c = scan.nextInt();
        int position1 = r + c;

        System.out.println("Enter a number between 1 to 8");
        int x = scan.nextInt();
        System.out.println("Enter a number between 1 to 8");
        int y = scan.nextInt();
        int position2 = x + y;

        if (((position1 % 2 == 0)&&(position2 % 2 == 0))||((position1 % 2 == 1)&&(position2 % 2 == 1))) {
            System.out.print(" The positions are with same color ");
        }
        else {
            System.out.println("The positions are with dfferent colors");
        }

    }
}
