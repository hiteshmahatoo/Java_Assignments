// 6. Declare a class Account having data members like account_number, name, address and balance. The data members need to be initialized using constructors and there are methods like deposit(), withdraw(), balance_enquiry() and summery_display(). You are required to prepare the class along with the required methods for the said purpose and write a menu driven Java program for the various operations on the account object. (Assume standard banking activities for various operations).
package assignment_6;
import java.util.*;

class Account{
    private int account_number;
    private double balance;
    private String Name, address;

    Account(int ac, String n, String add, long bal)
    {
        account_number = ac;
        Name = n;
        address = add;
        balance = bal;
    }
    void deposit(long dep)
    {
        balance = balance + dep;
        System.out.println("\nDeposit = "+dep+"\nBalance = "+balance);
    }
    void withdraw(long wd)
    {
        balance -= wd;
        System.out.println("\nWithdraw = "+wd+"\nBalance = "+balance);

    }
    void balance_enquiry()
    {
        System.out.println("\nAccount Balance = "+balance);
    }
    void summery_display()
    {
        System.out.println("\nAccount Number: "+account_number);
        System.out.println("Name: "+Name);
        System.out.println("Address: "+address);
        System.out.println("Balance: "+balance+"\n");
    }
}

public class q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Account a1 = new Account(3514435, "Hitesh Mahatoo", "ITER BH6 Bhubaneswar, Odisha", 20000);
        a1.deposit(500);
        a1.withdraw(200);
        a1.balance_enquiry();
        a1.summery_display();
        sc.close();
    }
    
}
