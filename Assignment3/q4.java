// Write a java program that takes three integers as command-line arguments and prints equal if all 
// three are equal, and not equal otherwise.
package Assignment3;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean res = ((a==b)&&(b==c));
        System.out.println("Result= " +res);
    }
    
}
