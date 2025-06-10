import java.util.Scanner;

/**
 *
 * @author shinr
 */
public class Q8 {
     public static void main(String[] args) {
        String input, reverse= "";
        
        Scanner scan = new  Scanner(System.in);
        System.out.println("Enter a string input :");
        input = scan.nextLine();
        
        for (int i =0 ; i<input.length();i++)
        {
            char ch = input.charAt(i);
            reverse = ch+reverse;    
        }
        System.out.println("The original user input : "+ input);
        System.out.println("The Reversed user input : "+ reverse);
        
        if(input.equals(reverse))
          System.out.println("Is palindrome");  
        else
          System.out.println("Is Not a palindrome");  
                
    
    
}
    
}