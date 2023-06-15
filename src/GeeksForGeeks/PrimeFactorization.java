package GeeksForGeeks;

public class PrimeFactorization {
    public static void main(String[] args) {
        printFactors(100);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void printFactors(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i+" ");
                    x = x * i;
                }
            }
        }
    }
}
