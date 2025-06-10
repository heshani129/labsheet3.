
import java.util.Scanner;//Q06

public class Set03 {

    public static void main(String[] args) {
        /*Q06 Write a Java program that takes a user input string and splits it into an array of substrings 
based on a specific delimiter*/

        String input;
        System.out.println("Enter string array inputs with commas: ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();

        //split with comma delimeter user input and asign the substring to the array substring
        String[] substrings = input.split(",");

        for (int i = 0; i < substrings.length; i++) {
            System.out.println(substrings[i]);
        }

    }

}
