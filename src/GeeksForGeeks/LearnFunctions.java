package GeeksForGeeks;

class Point {
    int pointX, pointY;
}
public class LearnFunctions {

    public static void main(String[] args) {
        Point p = new Point();
        p.pointX = 5;
        p.pointY = 10;
        doOperationsOnPoint(p);
        System.out.println("After Do operation on point function call: " + p.pointX + " " + p.pointY);


        int x = 5;
        doOperation(x);
        System.out.println("After Calling Do operation function: " + x);
    }

    public static void doOperation(int x) {
        x = x + 5;
        System.out.println("Inside Do Operation Function: " + x);
    }

    public static void doOperationsOnPoint(Point p) {
        p = new Point();
        p.pointX = 10;
        p.pointY = 20;
        System.out.println("Inside Do operation on point function call: " + p.pointX + " " + p.pointY);

    }

}
