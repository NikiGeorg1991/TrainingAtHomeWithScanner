import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("The hour is  " );
        int hour = scan.nextInt();
        System.out.println("Enter value of money: ");
        double money = scan.nextDouble();
        System.out.println("Enter fine or sick: ");
        boolean fine = scan.nextBoolean();

        if (fine == true){
            System.out.println(" Ще отида на кино с приятели.");
        }
        else{
            System.out.println(" Няма да излизам.");
        }

        if(money<0){
            System.out.println(" не валидна стойност");

        }
        if (money==0){
            System.out.println(" ще си стоя в нас и ще пия чай.");
        }
        if ((money <10)&&(money>0)){
            System.out.println("ще отида на кафе.");
        }
        if (money >=10){
            System.out.println("ще си купя лекарства.");
        }
    }
}
