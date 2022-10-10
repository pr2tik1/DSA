package Loops;

public class IceCreams {
    static int main (int N, int D){
        int eaten = 0;
        int rem = 0;
        for(int i=0; i<D; i++){
            eaten = N/2;
            rem = N-eaten;
            rem = rem*3;
            N = rem;
        }
        return rem;
    }
}
