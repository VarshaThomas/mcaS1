import java.util.Scanner;

class Person {
    String name;
    String gender;
    int age;
    String address;

    Person(String name, String gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }
}

class Employee extends Person {
    int empid;
    String c_name;
    String qual;
    double sal;

    Employee(String name, String gender, int age, String address, int empid, String c_name, double sal, String qual) {
        super(name, gender, age, address);
        this.empid = empid;
        this.c_name = c_name;
        this.sal = sal;
        this.qual = qual;
    }
}

class Teacher1 extends Employee {
    String dept;
    String sub;
    int tid;

    Teacher1(String name, String gender, int age, String address, int empid, String c_name, double sal, String qual, String dept, String sub, int tid) {
        super(name, gender, age, address, empid, c_name, sal, qual);
        this.dept = dept;
        this.sub = sub;
        this.tid = tid;
    }

    void display() {
        System.out.println("\n*****Teacher Information*****");
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Department: " + dept);
        System.out.println("Subject: " + sub);
        System.out.println("Teacher ID: " + tid);
        System.out.println("Company Name: " + c_name);
        System.out.println("Qualification: " + qual);
        System.out.println("Salary: " + sal);
    }
}

public class Teachers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teachers: ");
        int num = sc.nextInt();
        sc.nextLine(); 

        Teacher1[] teachers = new Teacher1[num];

        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter details for teacher " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String empname = sc.nextLine();
            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Company Name: ");
            String cname = sc.nextLine();
            System.out.print("Enter Qualification: ");
            String qual = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 
            System.out.print("Enter Department: ");
            String dept = sc.nextLine();
            System.out.print("Enter Subject: ");
            String sub = sc.nextLine();
            System.out.print("Enter Teacher ID: ");
            int tid = sc.nextInt();
            sc.nextLine();

            teachers[i] = new Teacher1(empname, gender, age, address, empid, cname, salary, qual, dept, sub, tid);
        }
        
        sc.close();
        
        System.out.println("\n*****Information of All Teachers*****");
        for (Teacher1 teacher : teachers) {
            teacher.display();
        }
    }
}