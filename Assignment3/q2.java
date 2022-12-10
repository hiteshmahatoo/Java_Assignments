// Write a java program to input the mark of a student and check if the student mark is greater than
// or equal to 40, then it generates the following message.
//                    ”Congratulation! You have passed the exam.”
// Otherwise the output message is
//                    ”Sorry! You have failed the exam.”
package Assignment3;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the marks of the student:");
        int marks = sc.nextInt();

        if(marks >= 40)
        System.out.println("congratulation! you have passed the exam.");
        else
        System.out.println("Sorry! You have failed the exam.\n");
        sc.close();

    }

    
}
