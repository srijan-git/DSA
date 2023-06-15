package dsaPractice.array;

public class SecondSmallestElement {
    public static int secondSmallest(int[] arr) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }

        return ssmallest;
    }

    public static void main(String[] args) {
        int[] arr = {11, 2, 1, 5, 6, 22};
        int result = secondSmallest(arr);
        System.out.println("The 2nd smallest : " + result);
    }
}
