// Define a class called Time with attributes hour,minute and second along with methods like get_time() and show_time() to input and display the time respectively. Also define a method add_time() which takes two time objects as input and returns a time object. Display the added time in terms of hour, minute and second using the same show_time().
package assignment_6;
import java.util.Scanner;

class time{
    Scanner sc = new Scanner(System.in);
    int hour, minute, second;
    void get_time()
    {
        System.out.print("Enter Hour: ");
        hour = sc.nextInt();
        System.out.print("Minute: ");
        minute = sc.nextInt();
        System.out.print("Second: ");
        second = sc.nextInt();
    }
    void show_time()
    {
        System.out.println("Hour: "+hour);
        System.out.println("Minute: "+minute);
        System.out.println("Second: "+second);      
    }
    void add_time(time t1, time t2)
    {
        time t3 = new time();
        t3.second = t1.second+t2.second;
        t3.minute = t1.minute+t2.minute;
        t3.hour = t1.hour+t2.hour;

        if(t3.second > 59)
        {
            t3.minute += (t3.second/60); 
            t3.second = (t3.second%60);
        }
        if(t3.minute > 59)
        {
            t3.hour += (t3.second/60);
            t3.minute = t3.minute%60;
        }
        System.out.println("Hour: "+t3.hour);
        System.out.println("Minutes: "+t3.minute);
        System.out.println("Seconds: "+t3.second);
    }
}

public class q3 {
    public static void main(String[] args){
        time t1 = new time();
        time t2 = new time();
        time t3 = new time();
        t1.get_time();
        System.out.println("\n");
        t1.show_time();
        System.out.println("\n"); 
        t2.get_time();
        System.out.println("\n");
        t2.show_time();
        System.out.println("\n");
        t3.add_time(t1, t2);
        System.out.println("\n");
    }
    
}
