package dsaPractice.array;

import java.util.Arrays;

public class RemoveDuplicateElement {
    public static int removeDuplicate(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5};
        int n = removeDuplicate(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
