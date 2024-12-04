package Way_Too_Long_Words;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        scr.nextLine(); 
       
        for (int i = 0; i < n; i++) {
            String a = scr.nextLine(); 
            
          
            if (a.length() > 10) {
               
                String abbreviation = a.charAt(0) + Integer.toString(a.length() - 2) + a.charAt(a.length() - 1);
                System.out.println(abbreviation);
            } else {
               
                System.out.println(a);
            }
        }
        scr.close(); 
    }
}

