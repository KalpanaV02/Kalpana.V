//Problem-2: Generate odd number series(1,3,5...)
//Language: Java
import java.util.Scanner;
public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create scanner object to read input
		Scanner sc=new Scanner(System.in);
		// Read single integer a
           int a = sc.nextInt();
        // Print first 'a' odd numbers
           for(int i=1;i<=a*2;i+=2) {
        	   System.out.print(i+", ");
        	    
           }

	}
}
