package CodeNinja.arraysproblems;

public class SecondLargestElement {
    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.
        int largest = Integer.MIN_VALUE;

        int slargest = Integer.MIN_VALUE;

        System.out.println(largest + " " + slargest);

        for (int i = 0; i < n; i++) {

            if (largest < arr[i]) {

                slargest = largest;

                largest = arr[i];
            } else if (slargest < arr[i] && arr[i] != largest) {

                slargest = arr[i];

            }
        }

        if (slargest == Integer.MIN_VALUE) {

            return -1;

        }

        return slargest;

    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8, 9};
        int result = findSecondLargest(arr.length, arr);
        System.out.println(result);
    }
}
