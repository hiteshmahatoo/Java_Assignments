import java.util.*;
class Circle{
    Scanner sc = new Scanner(System.in);
    double rad;
    void input()
    {
        int r = sc.nextInt();
        rad = r;
    }
    void area()
    {
        double a = 3.143*rad*rad;
        System.out.println("Area = "+a);
    }
    void circumference()
    {
        double c = 2*3.143*rad;
    }
}

class FirstClass{
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.input();
        c1.area();
        c1.circumference();
    }
}