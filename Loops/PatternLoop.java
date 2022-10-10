package Loops;

public class PatternLoop {
    static void Pattern(int N){
        int a = N;
        System.out.println("*");
        if(N>=3){
            for(int i=2; i<N; i++){
                for(int j=0; j<=i; j++){
                    if((i==j)||(j==0)){
                        System.out.print("*");
                    }else{
                        System.out.print("^");
                    }
                }
                System.out.println();
            }
        }
        for(int k=0; k<N+1; k++){
            System.out.print("*");
        }
    }
}
