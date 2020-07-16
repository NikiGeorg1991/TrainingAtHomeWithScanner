import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of number  A : ");
        int a = scan.nextInt();
        System.out.println("Enter the value of number  B : ");
        int b = scan.nextInt();
        System.out.println("Enter the value of number  C : ");
        int c = scan.nextInt();

        if (( a>b)&&(a>c)&&(b>c)){
            System.out.println(a + " , " + b + " , " + c);
        }
        if (( a>b)&&(a>c)&&(c>b)){
            System.out.println(a + " , " + c + " , " + b);
        }
        if (( b>a)&&(b>c)&&(a>c)){
            System.out.println(b + " , " + a + " , " + c);
        }
        if (( b>a)&&(b>c)&&(c>a)){
            System.out.println(b + " , " + c + " , " + a);
        }
        if (( c>a)&&(c>b)&&(a>b)){
            System.out.println(c + " , " + a + " , " + b);
        }
        if (( c>a)&&(c>b)&&(b>a)){
            System.out.println(c + " , " + b + " , " + a);
        }



    }
}
