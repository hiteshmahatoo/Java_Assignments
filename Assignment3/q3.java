// Input an integer through the keyboard. Write a java program to find out whether it is an odd number 
// or even number.
package Assignment3;
import java.util.*;

public class q3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number");
        int num = sc.nextInt();
        
        if(num%2==0)
        System.out.println("Even Number\n");
        else
        System.out.println("Odd Number\n");
        sc.close();
    }
    
}
