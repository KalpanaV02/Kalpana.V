// Problem-4: Count multiples of digits 1 to 9
// Language: Java
public class Program_4 {
    public static void main(String[] args) {
        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};
        // We need counts for 1 to 9 → we use index 1 to 9
        int[] count = new int[10];
        // Loop through all numbers
        for (int num : arr) {
            // Check multiples for 1 to 9
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) { // if divisible
                    count[i]++; // increase count
                }
            }
        }
        // Print in the same output format
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + count[i]);
            if (i < 9) System.out.print(", ");
        }
        System.out.println("}");
    }
}
