package Conditions;

import java.util.Scanner;

public class CheckingNumber {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>0){
            System.out.println("Positive");
        }else if(x<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
