import java.util.Scanner;

class Sports {
    String sport;
    int rating;
    
    Sports(String sport, int rating) {
        this.sport = sport;
        this.rating = rating;
    }
}

class Student extends Sports {
    String grade;
    double overallPercentage;
    
    Student(String sport, int rating, String grade, double overallPercentage) {
        super(sport, rating);
        this.grade = grade;
        this.overallPercentage = overallPercentage;
    }
}

public class Result extends Student {
    Result(String sport, int rating, String grade, double overallPercentage) {
        super(sport, rating, grade, overallPercentage);
    }
    
    void display() {
        System.out.println("\nSports Details of Student");
        System.out.println("Sport: " + sport);
        System.out.println("Rating: " + rating);
        System.out.println("\nAcademic Details of Student");
        System.out.println("Academic Grade: " + grade);
        System.out.println("Overall Percentage: " + overallPercentage);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        
        Result[] students = new Result[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter sports details for student " + (i + 1));
            System.out.print("Sport: ");
            String sport = sc.next();
            System.out.print("Sport rating out of 10: ");
            int rating = sc.nextInt();
            
            System.out.println("\nEnter academic details for student " + (i + 1));
            System.out.print("Academic grade: ");
            String grade = sc.next();
            System.out.print("Overall percentage: ");
            double overallPercentage = sc.nextDouble();
            
            students[i] = new Result(sport, rating, grade, overallPercentage);
        }
        
        sc.close();
        
        System.out.println("\nDisplaying Student Details:");
        for (Result student : students) {
            student.display();
        }
    }
}
