
import java.util.Scanner; //Q04 and Q05

public class Set02 {

    public static void main(String[] args) {
        /*Q04 Write a Java program that takes a user input string and counts the number of occurrences of a 
specific character in the string.*/

        String input;
        char ch;
        int count = 0;

        System.out.println("Enter a Word: ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        System.out.println("Enter a character: ");
        ch = scan.next().charAt(0);

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("\nThe Character '"+ ch +"' appears " + count + " times.");

        /*Q05  replaces all occurrences of a specific 
character with another character*/
        char replace;
        System.out.println("Enter a character to Repalace above character: ");
        replace = scan.next().charAt(0);
        
        
        System.out.println("\nAfter replacing '" + ch + "' in to '" + replace + "' is : " + input.replace(ch, replace));

    }

}
