package Loops;

public class PatternSara {
    static void Pattern(int N){
        int row = 0;
        int col = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(row + " ");
                row += 4;
                if(j==(N-1)){
                    row = 6*(i+1);
                }
            }
            System.out.println();
        }
    }
}
