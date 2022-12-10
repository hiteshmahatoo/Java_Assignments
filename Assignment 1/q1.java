import java.util.Scanner;
public class q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       int s1, s2, s3;
       int avg;
       System.out.println("Enter Sales figure for 3 items");
       s1 = sc.nextInt();
       s2 = sc.nextInt();
       s3 = sc.nextInt();

       avg = (s1+s2+s3)/3;
       if(s1<=10000 && s2<=10000 && s3<=10000 && avg<=9000)
       {
        if(avg<=3000)
        System.out.println("70%");
        else if(avg<=6000)
        System.out.println("40%");
        else 
        System.out.println("25%");
       }
       else
       System.out.println("Bouquet cannot be formed!");
    }
}