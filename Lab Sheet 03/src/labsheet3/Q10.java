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
public class Q10 {
    public static void main(String[] args) {
        String numeric1,numeric2;
        int num1,num2;
        
        Scanner scan = new Scanner(System.in);
        
        //Getting two user inputs from user
        System.out.println("Please enter first numerical value :");
        numeric1 = scan.nextLine();
        System.out.println("Please enter second numerical value : ");
        numeric2 = scan.nextLine();
        
        //II.Print these two string values by using the concatenation
        System.out.println("Concated two values : " + numeric1 + numeric2);
        
        //III.Next, Convert these two numerical strings into integer values
        num1 = Integer.parseInt(numeric1);
        num2 = Integer.parseInt(numeric2);
        
        //IV.Add these two numerical values and print the Sum.
        System.out.println("Sum of two values : "+ (num1 + num2));
        
        
    }
    
}
