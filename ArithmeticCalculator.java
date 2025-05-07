package arithmetic;

import java.util.Scanner;

public class ArithmeticCalculator implements Operations {
    Scanner s = new Scanner(System.in);

    public void add() {
        System.out.print("Enter two numbers to add: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Sum = " + (a + b));
    }

    public void subtract() {
        System.out.print("Enter two numbers to subtract: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Difference = " + (a - b));
    }

    public void multiply() {
        System.out.print("Enter two numbers to multiply: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Product = " + (a * b));
    }

    public void divide() {
        System.out.print("Enter two numbers to divide: ");
        int a = s.nextInt();
        int b = s.nextInt();
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            System.out.println("Quotient = " + ((double) a / b));
        }
    }
}
