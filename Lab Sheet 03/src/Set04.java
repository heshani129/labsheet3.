
import java.util.Scanner;
//Q07 Write a Java program that takes a user input string and reverses it

public class Set04 {

    public static void main(String[] args) {

        String input;
        String reverse = "";

        System.out.println("Enter a Word for Reverse: ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            reverse = ch + reverse;  //Concatenate two characters with +  sign
        }

        System.out.println("The Original Word: " + input);
        System.out.println("The Reverse Word: " + reverse);

    }
}
