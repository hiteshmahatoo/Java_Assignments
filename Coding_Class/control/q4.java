// Accept N , print all even/ odd numbers from 1 to n
package Coding_Class.control;
import java.util.Scanner;

public class q4 {
    public static void main(String []args ){
        int n, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        sc.close();
        System.out.println("Printing Even Numbers: ");
        for(i = 2; i <= n; i+=2)
        {
            System.out.print(i+"\t");
        }
        System.out.println("\nPrinting odd numbers: ");
        for(i = 1; i <= n; i+=2)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
