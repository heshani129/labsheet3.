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
public class Q4 {
    public static void main(String args[]){
        String userInput;
        
        
        Scanner scan = new Scanner(System.in);
        //getting user inputs
        System.out.println("Please enter a String vlaue : ");
        userInput = scan.nextLine();
        
        //getting the user input for the character to count
        System.out.print("Enter a character: ");
        char characterToCount = scan.next().charAt(0);

        // Count the occurrences of the character in the string
        int count = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == characterToCount) {
                count++;
            }
        }

        // Print the count of occurrences
        System.out.println("Number of occurrences of '" + characterToCount + "': " + count);
    }
   }
    
    

