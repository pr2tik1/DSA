package Conditions;

import java.util.Scanner;

public class LeapYear {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400!=0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }else{
                System.out.println("YES");
            }
        }else{
            System.out.println("NO");
        }
    }
}
