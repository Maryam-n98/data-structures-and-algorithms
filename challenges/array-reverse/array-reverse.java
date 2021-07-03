import java.util.*;
 
public class Main{
    public static void reverseArray(int[] A){
        int[] alength = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            alength[A.length - 1 - i] = A[i];
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = alength[i];
        }
    }
 
    public static void main(String[] args){
        int[] A = { 1, 2, 3, 4, 5, 6 };
        reverseArray(A);
        System.out.println(Arrays.toString(A));
    }
}