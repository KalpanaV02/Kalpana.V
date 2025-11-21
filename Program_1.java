
//Problem-1: Calculator using class
//Language: Java
import java.util.Scanner;

class Calculator {

 public double add(double a, double b) {
     return a + b; // addition
 }

 public double subtract(double a, double b) {
     return a - b; // subtraction
 }

 public double multiply(double a, double b) {
     return a * b; // multiplication
 }

 public double divide(double a, double b) {
     return a / b; // division
 }
}

public class Program_1 {
 public static void main(String[] args) {
	// Create scanner object to read input
     Scanner sc = new Scanner(System.in);
     Calculator calc = new Calculator();

     System.out.print("Enter a: ");
     double a = sc.nextDouble();

     System.out.print("Enter b: ");
     double b = sc.nextDouble();

     System.out.print("Enter operation (add/sub/mul/div): ");
     String typeOfOperation = sc.nextLine();

     double result = 0;

     // checking operation type
     switch(typeOfOperation) {
         case "add":
             result = calc.add(a, b);
             break;
         case "sub":
             result = calc.subtract(a, b);
             break;
         case "mul":
             result = calc.multiply(a, b);
             break;
         case "div":
             result = calc.divide(a, b);
             break;
         default:
             System.out.println("Invalid operation");
             return;
     }

     System.out.println("Result: " + result);
 }
}