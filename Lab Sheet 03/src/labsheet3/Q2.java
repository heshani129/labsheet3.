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
public class Q2 {
    public static void main(String[] args){
        String value,upper;
        Scanner scan = new Scanner(System.in);
        //getting user input
        System.out.println("Enter a String value : ");
        value = scan.nextLine();
        upper  = value.toUpperCase();
        //print the string value which has turned to the Uppercase
        System.out.println(value + " in Upper case : "+ upper);
        
    }
    
    
    
}
