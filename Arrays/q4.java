package Arrays;
// import java.util.Scanner;

class Student{
    String name;
    int age;
    

        Student(String name, int age){
            this.name = name;
            this.age = age;
        }
        void printInfo(){
            System.out.println(name);
            System.out.println(age);
         }
    
}
public class q4{
    public static void main(String[] args){
        Student s1 = new Student("Aman", 22);
        s1.printInfo();
    }

}