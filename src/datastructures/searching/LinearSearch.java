package datastructures.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = linearSearch(arr, 4);
        if (result == -1) {
            System.out.println("No element found....");
        } else {
            System.out.println("Found at the index of" + result);
        }
    }

    public static int linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
