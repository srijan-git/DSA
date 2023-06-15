package datastructures.recursion;

public class Recursion {

    public static long factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        long myFac = factorial(12);
        System.out.println(myFac);
    }
}
