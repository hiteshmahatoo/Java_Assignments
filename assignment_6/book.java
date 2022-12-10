// Write a program in Java to declare a class called Book with data members as title, publisher, authors, price and number_of_pages. Define member methods (as per your convenience) to input the data from user interface for the Book object and display it. Also you need to write a method to compare two Book objects and display whether they are the same books or different one. (Note: Use method which returns a boolean data type and also pass object as parameter to the method for comparing two book objects).
package assignment_6;
import java.util.*;
class books {
    Scanner sc = new Scanner(System.in);

    String title, publisher, author;
    int price, no_of_pages;

    void input()
    {
        System.out.println("Enter Details of the book");
        System.out.println("Title: ");
        title = sc.next();
        System.out.println("Publisher: ");
        publisher = sc.next();
        System.out.println("Author: ");
        author = sc.next();
        System.out.println("Price: ");
        price = sc.nextInt();
        System.out.println("Pages: ");
        no_of_pages = sc.nextInt();
    }

    void display()
    {
        System.out.println("\n\n DETAILS OF THE BOOK");
        System.out.println("Title: "+title);
        System.out.println("Publisher: "+publisher);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Pages: "+no_of_pages);
    }
    boolean compare(books b1, books b2)
    {
        if(b1.title.equals(b2.title) && b1.publisher.equals(b2.publisher) && b1.author.equals(b2.author) && b1.price == (b2.price) && b1.no_of_pages == (b2.no_of_pages))
        {
            return true;
        }
        else
        return false;
    }
}

public class book{
    public static void main(String args[]){
        books b1 = new books();
        books b2 = new books();
        b1.input();
        b2.input();
        b1.display();
        b2.display();
        System.out.println(b1.compare(b1, b2));
    }
}