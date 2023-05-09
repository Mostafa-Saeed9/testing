import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, sum = 0;


        while (true) {
            System.out.print("Enter  first number ");
            try {
                num1 = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("incorrect input enter again");
            }
        }


        while (true) {
            System.out.print("Enter second number ");
            try {
                num2 = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("incorrect input enter again");

            }
        }

        sum = num1 + num2;
        System.out.println("sum of two numbers = " + sum );
    }
}