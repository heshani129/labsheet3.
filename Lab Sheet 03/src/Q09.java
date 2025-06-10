
import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String name = scan.nextLine();
        System.out.println("Length:" + name.length());//a
        System.out.println("Capital:" + name.toUpperCase());//b
        System.out.println("Simple:" + name.toLowerCase());//c
        System.out.println("Enter the next string :");//d
        String name2 = scan.nextLine();
        System.out.println("concat :" + name.concat(" " + name2));//e
    }

}
