
import java.util.Scanner;

/*Q08  Write a Java program that takes a user input string and checks if it is a palindrome (reads the 
same forward and backward).
 */

public class Set05 {

    public static void main(String[] args) {

        String input;
        String reverse = "";

        System.out.println("Enter a Word for check Palindrome: ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            reverse = ch + reverse;  //Concatenate two characters with +  sign
        }
        input = input.toLowerCase();
        reverse = reverse.toLowerCase();

        if (input.equals(reverse)) {
            System.out.println("It is a Palindrome ");
        } else {
            System.out.println("It is not a Palindrome ");
        }

    }
}
