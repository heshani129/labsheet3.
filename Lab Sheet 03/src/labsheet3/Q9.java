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
public class Q9 {
     public static void main(String[] args) {
       String input, upper,lower,input2;
       int length=0;
       
       Scanner scan = new Scanner(System.in);
       //getting string input from user
       System.out.print("Please eneter a string input/word : ");
       input=scan.nextLine();
       
       //I.Count the number of characters in that string input
       length = input.length();
       System.out.println("String input : " + input + "\nLength :" +length);
       
       //II.Print that string input in all UpperCase
       upper = input.toUpperCase();
       System.out.println("In Upper Case : " +upper);
       
       //III.Print that string input in all Lower Case
       lower= input.toLowerCase();
       System.out.println("In Lower Case : " +lower);
       
       //IV.Now ask the user to enter another string input
       System.out.print("Please enter another string input/word :");
       input2 = scan.nextLine();
       
       // V.Print both the string inputs by combining them (concatenation)
       //method I
       System.out.println("Concatanated words using concatanation operator : " + input +" " + input2);
       //method II
       System.out.println("Concatanated words using concat method : " + input.concat(" "+ input2) );
       
       
       
    }
    
}
