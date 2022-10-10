package Arrays1D;

import java.util.Scanner;

public class Donation {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        long totalDonation = 0;
        int temp = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            temp = Math.max(temp, arr[i]);
            System.out.print(temp-arr[i] + " ");
            totalDonation += temp;
        }
        System.out.println();
        System.out.println(totalDonation);

    }
}
