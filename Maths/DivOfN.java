package Maths;

import java.util.Scanner;

public class DivOfN {
    public static void CountNumberOfDivisersDivisibleByTwo(int n){
        int count = 0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(i==n/i && i%2==0){
                    // System.out.print(i + " ");
                    count++;
                }else{
                    if(i%2==0){
                        // System.out.print(i+" ");
                        count++;
                    }
                    if((n/i)%2==0){
                    //    System.out.print(n/i + " "); 
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int n = sc.nextInt();
            CountNumberOfDivisersDivisibleByTwo(n);
        }
    }
}
