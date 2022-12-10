package objectsAndClass;
import java.util.*;

class student{
    Scanner sc = new Scanner(System.in);
    int regNo, sem;
    String  name, branch;
    void getData(){
        System.out.print("Registration number: ");
        regNo = sc.nextInt();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Branch: ");
        branch = sc.nextLine();
        System.out.println("Semester: ");
        sem = sc.nextInt();
    }
    void show(){
        System.out.print("Registration number: "+regNo);
        System.out.print("Name: "+name);
        System.out.print("Branch: "+branch);
        System.out.println("Semester: "+sem);
    }
}

public class q2StudentInfo {
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student();
        s1.getData();
        s1.show();
    }
    
}
