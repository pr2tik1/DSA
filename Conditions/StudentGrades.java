package Conditions;
import java.util.Scanner;

public class StudentGrades {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int marks = ((m1+m2+m3+m4+m5)*100)/500;
        if(marks>=80){
            System.out.println("A");
        }else if(80>marks && marks>=60){
            System.out.println("B");
        }else if(60>marks && marks>=40){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}
