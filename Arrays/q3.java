package Arrays;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(arr[i] < min)
            min = arr[i];
            if(arr[i] > max)
            max = arr[i];
        }
        System.out.println("Minimum Element: "+min);
        System.out.println("Maximum Element: "+max);
    }
}