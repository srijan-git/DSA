package practice;

import java.util.Arrays;

public class PracticeSortings {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 8, 1, 0};
        int[] array1 = {1, 3, 7, 8};
        int[] array2 = {2, 4, 5, 6};

        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
        System.out.println("Bubble Sort: " + Arrays.toString(arr));
        System.out.println("Selection Sort: " + Arrays.toString(arr));
        System.out.println("Insertion Sort: " + Arrays.toString(arr));
        System.out.println("Merge sort: " + Arrays.toString(mergeSort(array1, array2)));


    }

    public static void bubbleSort(int[] arr) {
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

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }


    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j > -1 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }


    public static int[] mergeSort(int[] arr1, int[] arr2) {
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0, i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                combined[index] = arr1[i];
                index++;
                i++;
            } else {
                combined[index] = arr2[j];
                index++;
                j++;
            }
        }

        while (i < arr1.length) {
            combined[index] = arr1[i];
            index++;
            i++;
        }
        while (j < arr2.length) {
            combined[index] = arr1[j];
            index++;
            j++;
        }
        return combined;
    }

}
