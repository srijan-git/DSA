package datastructures.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swapHelper(int[] arr, int firstIndex, int lastIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    public static int pivot(int[] arr, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (arr[i] < arr[pivotIndex]) {
                swapIndex++;
                swapHelper(arr, swapIndex, i);
            }
        }
        swapHelper(arr, pivotIndex, swapIndex);
        return swapIndex;
    }


    public static void quickSortHelper(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(arr, left, right);
            quickSortHelper(arr, left, pivotIndex - 1);
            quickSortHelper(arr, pivotIndex + 1, right);
        }
    }

    public static void quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);

    }


    public static void main(String[] args) {
        int[] myArr = {4, 6, 1, 7, 3, 2, 5};
        quickSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }
}
