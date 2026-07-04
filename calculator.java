
import java.util.*;

public class calculator {

    public static void main(String[] args) {
        System.err.println(" ENTER TWO INTEGEGERS YOU WISH TO WORK WITH");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("enter no. 1 to add ");

        System.out.println("enter no. 2 to subtract");

        System.out.println(" enter no . 3 to multiply  or enter no . 4 to divide or enter no. 5 to find the remainder");

        System.out.println("enter choice");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}
