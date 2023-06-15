package dsaPractice.array;

public class LargestElement {
    public static int largest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 10, 6};
        int result = largest(arr);
        System.out.println("The largest Element is: " + result);
    }
}
