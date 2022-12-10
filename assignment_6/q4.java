// 4. Create a class Rectangle with two attributes length and width, each of which is initialized to 0.There are methods to calculate perimeter and area of the rectangle. It has get() ad set() for both the attributes, however the set() should verify that the length and width are greater than 0 and less than 20.
package assignment_6;
import java.util.Scanner;

class rectangle{
    Scanner sc = new Scanner(System.in);
    double length = 0, width = 0;

    void getLength(int l)
    {
        length = l;
    }
    void getWidth(double w)
    {
        width = w;
    }
    double setLength()
    {
     if(length < 0 || length > 20)
     {
        length = 0;
        return length;
     }
    else return length;
    }
    double setWidth()
    {
     if(width < 0 || width > 20)
     {
        width = 0;
        return width;
     }
    else 
        return width;
    }
    void area()
    {
        double area = setLength()*setWidth();
        System.out.println("Area = "+area);
    }
    void perimeter()
    {
        double perimeter = 2*(length+width);
        System.out.println("Perimeter = "+perimeter);
    }
}

public class q4 {
    public static void main(String[] args)
    {
       rectangle r1 = new rectangle();
       r1.getLength(2);
       r1.getWidth(3);
       r1.area();
       r1.perimeter();
    }
    
}
