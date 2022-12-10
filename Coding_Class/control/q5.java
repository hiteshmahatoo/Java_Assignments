// 5.Accept N, print sum of all numbers till N 
package Coding_Class.control;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of all numbers till "+n+" is "+n*(n+1)/2);
    }

}
