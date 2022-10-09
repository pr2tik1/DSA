package Conditions;

import java.util.Scanner;

public class TicTacToe {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String player1 = sc.next();
        String player2 = sc.next();
        if(player1.equals("R") || player2.equals("R")){
            System.out.println("R");
        }else if(player1.equals("J")){
            System.out.println(player2);
        }else if(player2.equals("J")){
            System.out.println(player1);
        }else{
            System.out.println("D");
        }
    }
}
