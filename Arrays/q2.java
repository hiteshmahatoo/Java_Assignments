package Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.print("Enter the size of the array: ");
        m = sc.nextInt();
        int arr[] = new int[m];
        System.out.print("Enter the number to be searched: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < m; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==n)
            System.out.println("TRUE");
        }

        
    }
    
}
