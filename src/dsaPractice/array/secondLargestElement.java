package dsaPractice.array;

public class secondLargestElement {
    public static int secondLargest(int[] arr) {
        int largest = arr[0];
        int slargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = largest;
                largest = arr[i];
            }
        }
        return slargest;
    }

    public static void main(String[] args) {
        int[] arr = {11, 2, 1, 5, 6, 22};
        int result = secondLargest(arr);
        System.out.println("The 2nd largest : " + result);
    }
}
