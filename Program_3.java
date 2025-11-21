//Problem-3: Generate odd number series based on input rules
//Language: Java
import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take only ONE integer as input
        int a = sc.nextInt();
        // If 'a' is odd -> print 'a' odd numbers
        // If 'a' is even -> print (a - 1) odd numbers
        int limit = (a % 2 == 0) ? (a - 1) * 2 : a * 2;
        // Print odd numbers from 1 until limit
        for (int i = 1; i < limit; i += 2) {
            System.out.print(i + ", ");
        }
    }
}