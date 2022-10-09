package Programming;
import java.util.Scanner;

class RMSArray{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int arr_len = sc.nextInt();
        int array[] = new int[arr_len];
        int sum = 0;
        for(int i=0; i<arr_len; i++){
            array[i] = (int) Math.pow(sc.nextInt(),2);
            sum += array[i];
        }
        float mean = (float) sum/arr_len;
        float rms = (float) Math.sqrt(mean);
        System.out.printf("%6f",rms);
    }
}