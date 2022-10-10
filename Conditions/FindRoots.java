package Conditions;

import java.util.Scanner;

public class FindRoots {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float determinant = (b*b) - (4*a*c);
        float root1, root2;

        if(determinant>0){
            root1 = (-b + (float) Math.sqrt(determinant))/(2*a);
            root2 = (-b - (float) Math.sqrt(determinant))/(2*a);
            System.out.format("%.2f\n",root1);
            System.out.format("%.2f\n",root2);
        }else if(determinant==0){
            root1 = root2 = -b / (2 * a);
            System.out.format("%.2f\n",root1);
            System.out.format("%.2f\n",root2);
        }else{
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("%.2f+i%.2f\n", real, imaginary);
            System.out.format("%.2f-i%.2f\n", real, imaginary);
        }

    }
}
