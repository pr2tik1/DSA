package Loops;

public class RotationPolicy {
    static int RotationPolicy(int A, int B){
        int count = 0;
        for(int i=A; i<=B; i++){
            int j = i-2;
            if(i%6==0){
                count++;
            }else if(j%6==0){
                count++;
            }
        }
        return count;
    }
}
