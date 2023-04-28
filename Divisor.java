import java.util.ArrayList;
import java.util.Arrays;

public class Divisor {
    public static void main(String[] args) {
        int num = 27;
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        int[] arr= new int[count];
        for(int i=1, j =0;i<=num;i++){
            if(num%i==0){
                arr[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
