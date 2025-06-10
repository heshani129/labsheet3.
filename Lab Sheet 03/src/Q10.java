
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First number :");//a
        String num1 = scan.nextLine();
        System.out.println("Enter the second number :");

        String num2 = scan.nextLine();
        System.out.println("Concat number:" + num1.concat(num2));//b
        int x = Integer.parseInt(num1);//c
        int y = Integer.parseInt(num2);
        int Total = x + y;
        System.out.println("Total:" + Total);//d
    }

}
