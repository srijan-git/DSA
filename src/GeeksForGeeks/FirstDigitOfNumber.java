package GeeksForGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstDigitOfNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int number = Integer.parseInt(br.readLine());
        System.out.println(firstDigitOfNumber(number));
        System.out.println("Using log: " + printFirstNumber(number));
    }

    public static int firstDigitOfNumber(int number) {
        while (number > 10) {
            number = number / 10;
        }
        return number;
    }

    public static int printFirstNumber(int number) {
        double power = Math.log10(number);
        int p = (int) power;
        int a = (int) Math.pow(10, p);
        int ans = number / a;
        return ans;

    }
}
