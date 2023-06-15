package Basics;

public class LeapYear {
    public static void main(String[] args) {
        int x = 2000;
        if ((x % 4 == 0) && (x % 100 == 0) || (x % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not leap year");
        }
    }
}
