package Loops;

public class PrintDigits {
    static void Print_Digits(int N){
        int num = N;
        int rem = 0;
        String print_rem;
        ArrayList<String> ar = new ArrayList<String>();
        while(num!=0){
            rem = num%10;
            print_rem = getNumber(rem);
            ar.add(print_rem);
            num = num/10;
        }

        for(int i=ar.size()-1; i>=0; i--){
            System.out.print(ar.get(i));
        }

    }

    static String getNumber(int x){
        String res;
        switch(x){
            case 0:
                res= "zero ";
                break;
            case 1:
                res= "one ";
                break;
            case 2:
                res= "two ";
                break;
            case 3:
                res= "three ";
                break;
            case 4:
                res= "four ";
                break;
            case 5:
                res= "five ";
                break;
            case 6:
                res= "six ";
                break;
            case 7:
                res= "seven ";
                break;
            case 8:
                res= "eight ";
                break;
            case 9:
                res= "nine ";
                break;
            default:
                res= "wrong ";
        }
        return res;
    }
}
