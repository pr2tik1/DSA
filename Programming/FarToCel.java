package Programming;
import java.util.Scanner;

public class FarToCel {
    public static void main (String[] args) {
        // Your code here
    Scanner sc = new Scanner(System.in);
    int f = sc.nextInt();
    int c = ((f-32)*5)/9;
    System.out.println(c); 
    }
}
