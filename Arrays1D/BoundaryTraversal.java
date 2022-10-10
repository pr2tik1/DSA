package Arrays1D;

import java.util.Scanner;

public class BoundaryTraversal {
    public static void printBoundary(int arr[][], int m,
                                     int n)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    System.out.print(arr[i][j] + " ");
                if ((j == n - 1) && (i!=0))
                    System.out.print(arr[i][j] + " ");
            }
        }
        if(m>1 && n>1){
            for(int a = (m-1); a >= 0; a--){
                for(int b = (n-1); b >= 0; b--){
                    if ((a == m - 1) && (b!=(n-1)))
                        System.out.print(arr[a][b] + " ");
                    if ((b == 0) && (a!=(m-1)) && (a!=0))
                        System.out.print(arr[a][b] + " ");
                }
            }
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for(int j=0; j<n; j++){
                for(int k=0; k<m; k++){
                    arr[j][k] = sc.nextInt();
                }
            }
            printBoundary(arr, n, m);
            System.out.println();
        }
    }
}
