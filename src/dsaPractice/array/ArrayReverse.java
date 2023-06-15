package dsaPractice.array;

import java.util.Arrays;

public class ArrayReverse {
    public static void arrayReverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    arrayReverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
