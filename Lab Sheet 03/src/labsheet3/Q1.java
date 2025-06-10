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
public class Q1 {
    public static void main(String[] args){
        String value;
        int length;
        
        Scanner scan = new Scanner(System.in);
        //get user input
        System.out.println("Please Enter a string value : ");
        value = scan.nextLine();
        length = value.length();
        //print the length of the string value
        System.out.println("The length of the entered string : " + length);
    }
}
