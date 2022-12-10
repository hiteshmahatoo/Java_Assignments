package objectsAndClass;
// import java.util.Scanner;

class Student{
    String name;
    int age;
    

        Student(String name, int age){
            this.name = name;
            this.age = age;
        }
        void printInfo(){
            System.out.println("this.name");
            System.out.println("this.age");
         }
    
}
public class test{
    public static void main(String[] args){
        Student s1 = new Student("Aman", 22);
        s1.printInfo();
    }

}