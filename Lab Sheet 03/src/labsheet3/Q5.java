/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet3;

import java.util.Scanner;

/**
 *
 * @author shinr
 */
public class Q5 {
    public static void main(String[] args) {
        
        String userInput;
        
        //get the user input
        System.out.print("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        userInput = scan.nextLine();

        //ask the user which character of the user input need to replace
        System.out.print("Enter the that you want to replace: ");
        char charToReplace = scan.next().charAt(0);

        //ask the user replacement character
        System.out.print("Enter a replacement character: ");
        char replacementChar = scan.next().charAt(0);

        // Replace all occurrences of the character in the string
        String replacedString = userInput.replace(charToReplace, replacementChar);

        // Print the resulting string
        System.out.println("Modified string: " + replacedString);
    }

}
