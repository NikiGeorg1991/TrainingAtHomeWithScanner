import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kofa1 = 2;
        int kofa2 = 3;
        int count = 0;

        System.out.println(" Веведете големина на цистерната в литри: ");
        int tank = scan.nextInt();
        int howMuch = tank / 5;
        int unDiv = tank % 5;
        System.out.println(" Кофите са използвани : " + howMuch + " пъти.");


        if (unDiv == 3) {
            System.out.println(" Допълнително трябва да се използва кофа от 3 литра.");
        } else {
            if (unDiv == 2) {
                System.out.println(" Допълнително трябва да се използва кофа от 2 литра.");
            } else {
                if (unDiv == 4) {
                    System.out.println(" Допълнително трябва да се използват 2 броя кофи от 2 литра, което не е според оказанията.");
                } else {
                    if (unDiv == 1) {
                        System.out.println(" Остава 1 литър, който няма как да се изведе според оказанията на задачата.");
                    }
                }
            }
        }
    }
}

