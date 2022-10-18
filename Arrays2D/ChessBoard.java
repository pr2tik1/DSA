package Arrays2D;
import java.util.Scanner;

public class ChessBoard {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c1=0, c2=0;
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n; j++){
            int p = sc.nextInt();
            int x = (i+j)&1;
            if(p==x){
              c1+=1;
            }
            if(p!=x){
              c2+=1;
            }
          }
        }
        if(c1<c2){
          System.out.println(c1);
        }
        else{
          System.out.println(c2);
        }
      }
}
