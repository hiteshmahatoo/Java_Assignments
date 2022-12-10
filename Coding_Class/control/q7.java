// 7. Accept N, Print the fibonacci series till N(N = 10 : 0 1 1 2 3 5 8)
package Coding_Class.control;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1, c;
        System.out.println(a+" ");
        while (b <= n)
        {
            c = a+b;
            System.out.println(b+" ");
            a = b;
            b = c;
        }

        sc.close();
    }
}
