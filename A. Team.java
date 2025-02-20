//https://codeforces.com/problemset/problem/231/A
import java.util.Scanner;

public class solve {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        int n = scr.nextInt(); // Read the number of problems
        int count = 0; // Count the number of problems they will solve

        for (int i = 0; i < n; i++) {
            int petya = scr.nextInt();
            int vasya = scr.nextInt();
            int tonya = scr.nextInt();

            // If at least two of them are sure, they will solve the problem
            if (petya + vasya + tonya >= 2) {
                count++;
            }
        }

        System.out.println(count); // Print the final count
        scr.close();
    }
}
