import java.util.Scanner;
 class Employee{
    int age;
    float salary;
    String name,address,phone_no;
    Scanner data = new Scanner(System.in);
    void salary(){
        System.out.println("Employee salary:");
        salary = data.nextInt();
    }  
}

class Manager extends Employee{
    String spec,dep;
    Scanner data = new Scanner(System.in);
    void display2(){
        System.out.println("-:Manager:-");
        System.out.println("Enter the name:");
        name = data.next();
        System.out.println("Enter the age:");
        age = data.nextInt();
        System.out.println("Enter the address:");
        address = data.next();
        System.out.println("Enter the phone-no:");
        phone_no = data.next();
        System.out.println("Enter the specilization:");
        spec = data.next();
        System.out.println("Enter the department:");
        dep = data.next();
    }
}

class Officer extends Employee{
    String spec,dep;
    Scanner data = new Scanner(System.in);
    void display1(){
        System.out.println("-:Officer:-");
        System.out.println("Enter the name:");
        name = data.next();
        System.out.println("Enter the age:");
        age = data.nextInt();
        System.out.println("Enter the address:");
        address = data.next();
        System.out.println("Enter the phone-no:");
        phone_no = data.next();
        System.out.println("Enter the specilization:");
        spec = data.next();
        System.out.println("Enter the department:");
        dep = data.next();
    }
}

public class Inheritance {
    public static void main(String args[])
    {
        Officer O = new Officer();
        Manager M = new Manager();
        O.display1();
        O.salary();
        M.display2();
        M.salary();
    }
}
