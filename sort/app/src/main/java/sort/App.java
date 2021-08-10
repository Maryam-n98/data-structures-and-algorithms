/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        int arr[] = { 8,4,23,42,16,15 };

     App app = new App();
        app.sort(arr);

        for (int num: arr) {
            System.out.println(num);
        }
        System.out.println(Arrays.toString(arr));
    }

   public void sort(int arr[]) {
        int length = arr.length;
        for (int i = 1; i < length; ++i) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}