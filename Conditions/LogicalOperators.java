package Conditions;

import java.util.Scanner;

public class LogicalOperators {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<=10 && b>=10){
            System.out.print("true ");
        }else{
            System.out.print("false ");
        }

        if (a%2==0 || b%2==0){
            System.out.print("true ");
        }else{
            System.out.print("false ");
        }

        if (a!=b){
            System.out.print("true ");
        }else{
            System.out.print("false ");
        }
    }
}
