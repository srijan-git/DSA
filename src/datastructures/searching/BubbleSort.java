package datastructures.searching;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = recursiveBinarySearch(arr, 2, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("No element found....");
        } else {
            System.out.println("Found...." + result);
        }
    }

    public static int binarySearch(int arr[], int element, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


    public static int recursiveBinarySearch(int[] arr, int element, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] < element) {
                return recursiveBinarySearch(arr, element, mid + 1, high);
            } else {
                return recursiveBinarySearch(arr, element, low, mid - 1);
            }
        }
        return -1;
    }
}
