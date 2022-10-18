package Maths;

import java.util.Scanner;

public class NumOfPrimes {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int count = 0;
        for(int i = 2; i<n; i++){
            if(isPrime(i)){
                count++;
                // System.out.print(i + " ");
            }
        }
        // System.out.println();
        System.out.println(count);
    }
}
