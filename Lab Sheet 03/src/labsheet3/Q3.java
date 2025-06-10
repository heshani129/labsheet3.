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
public class Q3 {
    public static void main(String[] args){
        String userInput;
        String suffix = "bu";
        //declaring the suffix that needs to check
        boolean startsWithSuffix;
        Scanner scan = new Scanner(System.in);
        //getting user inputs
        System.out.println("Please enter a String vlaue : ");
        userInput = scan.nextLine();
        
        //checks whether the entered user input starts with a specific suffix
        startsWithSuffix = userInput.toLowerCase().startsWith(suffix.toLowerCase());
        
        //print the result
        System.out.println(startsWithSuffix);

        
    }
    
    
}
