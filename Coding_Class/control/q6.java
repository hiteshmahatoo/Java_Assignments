// 6. Accept N, print product of all numbers till N. - find factorial.
package Coding_Class.control;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        System.out.println("Using for loop: ");
        int product = 1;
        for(int i = 1; i<=n; i++)
        {
            product *= i;
        }
        System.out.println("Product = "+product);
        sc.close();
    }
}
