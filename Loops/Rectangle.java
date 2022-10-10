package Loops;

import java.util.Scanner;

public class Rectangle {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if((j==(m-1))||(j==0)||(i==(n-1))||(i==0)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
