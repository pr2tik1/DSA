package Conditions;

public class Race {
    static char Race(int A,int B,int C){
        int distance1 = Math.abs(C-A);
        int distance2 = Math.abs(C-B);
        String res;
        if (distance1 < distance2){
            res = "N";
        }else if (distance1 > distance2){
            res = "S";
        }else{
            res = "D";
        }
        return res.charAt(0);
    }
}
