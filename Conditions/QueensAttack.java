package Conditions;

public class QueensAttack {
    static int QueenAttack(int X, int Y, int P, int Q){
        if( (X==Y) && (P==Q) ){
            return 1;
        } else if( (X==P) || (Y==Q) ){
            return 1;
        } else if( Math.abs(X-P) == Math.abs(Y-Q) ){
            return 1;
        } else {
            return 0;
        }
    }
}
