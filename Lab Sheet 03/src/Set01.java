import java.util.Scanner;// Q01,02,03

public class Set01 {

    public static void main(String[] args) {
        //Q01  prints the length of the string.
        String input,suffix;
        System.out.println("Enter a Word: ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        System.out.println("\nLenght of the Word: " + input.trim().length());

        //Q02 converts it to uppercase
        System.out.println("Input in UpperCase: " + input.toUpperCase());

        //Q03 checks if it starts with a specific suffix
        System.out.println("\nEnter the suffix to Check: ");
        suffix=scan.nextLine();
        System.out.println(input.startsWith(suffix));
        
      
        
    }

}
