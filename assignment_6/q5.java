// Define a class Fruit having instance variable name, colour and taste. Use constructor to initialize the members if provided at the time of object creation as parameter otherwise the default name is banana, colour is yellow and taste is sweet. Define a separate class to create objects of Fruit class and display the attributes.
package assignment_6;

class Fruit{
    String name, colour, taste;
    Fruit()
    {
        name = "Banana";
        colour = "Yellow";
        taste = "Sweet";
    }
    Fruit(String n, String c, String t)
    {
        name = n;
        colour = c;
        taste = t;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Colour: "+colour);
        System.out.println("Taste: "+taste);
    }

}

public class q5 {
    public static void main(String[] args){
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit("Orange", "Orange", "Sour");
        f1.display();
        f2.display();
    }
}
