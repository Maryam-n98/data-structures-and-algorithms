
import java.util.Arrays;
import java.util.Random;

public class Main {
    static int[] insertShiftArray (int[] originalArr , int newItem) {
        int mid;
        int newArr[] = new int[originalArr.length + 1];
        if ( originalArr.length % 2== 0 ){
           mid = originalArr.length / 2;
        }else{
          mid= originalArr.length / 2 + 1;
        }
        for (int i = 0; i <newArr.length ; i++) {

            if (i < mid) {
                newArr[i] = originalArr[i];
            }
            else if (i == mid) {
                newArr[i] = newItem;
            }
            else {
                newArr[i] = originalArr[i-1];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int x[] = {42,8,15,23,42};
        System.out.println(Arrays.toString(insertShiftArray(x,16)));
    }
}
