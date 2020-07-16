import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int abc = scan.nextInt();
        int a = (abc / 100) % 10;
        int b = (abc / 10) % 10;
        int c = abc % 10;
        if (abc < 100 || abc > 999) {
            System.out.println("Enter a number with 3 symbols!");
        } else {
            if (a == b && b == c) {
                System.out.println("The numbers are equal each other!");
            } else {
                if (a > b && b > c) {
                    System.out.println("Ascending");
                } else {
                    if (a < b && b < c) {
                        System.out.println("Descending");
                    } else {
                        System.out.println("None of them!");
                    }
                }
            }
        }
    }
}
