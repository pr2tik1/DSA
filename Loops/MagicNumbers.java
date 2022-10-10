package Loops;

public class MagicNumbers {
    static int MagicNumber(int N){
        int i = 0;
        while(check(N-i)==true && check(N+i)==true){
            i++;
        }
        if(check(N-i)==false){
            return N-i;
        }else{
            return N+i;
        }
    }

    static boolean check(int n){
        boolean s = false;
        boolean p = false;

        while(n>0){
            if(n%10==7){
                s=true;
            }
            if(n%10==9){
                p=true;
            }
            n/=10;
        }
        if(s&&p){
            return false;
        }
        return true;
    }
}
