package Programming;
import java.util.*;

public class RamGrades {
    public static void main (String[] args) {
        // Your code here
    Scanner sc = new Scanner(System.in);
    int marks1 = sc.nextInt();
    int marks2 = sc.nextInt();
    int marks3 = sc.nextInt();
    int marks4 = sc.nextInt();
    int percentage = ((marks1 + marks2 + marks3 + marks4)*100)/400;
    System.out.println(percentage);
    }
}
