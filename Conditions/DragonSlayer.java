package Conditions;

public class DragonSlayer {
    static int DragonSlayer(int A, int B, int C, int D) {
        //Run following till any one of A and B equal to zero
        //Natsu fights first (Decrease Dragon's health)
        //Dragon fights (Decrease Natsu's health)
        while (A > 0 && C > 0) {
            A = A - D;
            C = C - B;
        }
        if (A <= 0) {
            return 1;
        } else {
            return 0;
        }
    }
}