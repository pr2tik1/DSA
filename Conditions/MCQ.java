package Conditions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MCQ {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer marks[] = {0,0,0,0};
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        int max = Collections.max(Arrays.asList(marks));
        System.out.println(max);
    }
}
