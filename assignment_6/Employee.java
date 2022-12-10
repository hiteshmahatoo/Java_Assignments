//1. Create a class called Employee having data members emp_id, name, department, basic_salary and designation. 
// Use methods input() and display() to get the data and view the details of an employee including gross salary.
//  The gross salary of the employee is the sum of basic_salary along with DA and HRA. DA is 20% and HRA is 
// 16% of the basic_salary
package assignment_6;
import java.util.*;

class Employees {
    Scanner sc = new Scanner(System.in);

    int emp_id, basic;
    String name, dept, desg;

    void input()
    {
        System.out.print("Enter Employee ID: ");
        emp_id = sc.nextInt();
        System.out.print("Employee Name: ");
        name = sc.next();
        System.out.print("Department: ");
        dept = sc.next();
        System.out.print("Basic Salary: ");
        basic = sc.nextInt();
        System.out.print("Designation: ");
        desg = sc.next();
    }

    void display()
    {
        double DA, HRA, GROSS;
        DA = 0.2 * basic;
        HRA = 0.16 * basic;
        GROSS = basic + DA + HRA;
        System.out.println("DETAILS OF EMPLOYEE");
        System.out.println("ID: "+emp_id +"\n"+ "Name: "+name+ "\n"+ "Department: "+dept+"\n"+"Designation: "+desg+"\n"+"Basic Salary: "+basic+"\n"+"Gross Salary: "+GROSS);
    }
}

class Employee{
    public static void main(String[] args){
        Employees e1 = new Employees();
        e1.input();
        e1.display();
    }
}