// Write a java program to input the height of the person and check if the height of the person is 
// greater than or equal to 6 feet then print the message “The person is tall”.
package Assignment3;
import java.util.*;

public class q1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Height in feet");
        int feet = sc.nextInt();
        // System.out.println("Enter your Height in inches");
        // int inches = sc.nextInt();

        if(feet >= 6)
            System.out.println("The person is tall.");
            else
            System.out.println("less than 6 feet.");
            sc.close();
    
    }
    
}
