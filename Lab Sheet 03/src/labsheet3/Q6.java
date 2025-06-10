import java.util.Scanner;

/**
 *
 * @author shinr
 */
public class Q6 {
    public static void main(String args[])   
            
    {   
        //defining a String object  
        String s = "Life,is,your,creation";   
        //split string delimited by comma  
        String[] stringarray = s.split(",");    //we can use dot, whitespace, any character   
        //iterate over string array  
        for(int i=0; i< stringarray.length; i++)  
        {  
        //prints the tokens  
        System.out.println(stringarray[i]);  
        }  

    
    }
}
