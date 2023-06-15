package datastructures.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        bubblesort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
