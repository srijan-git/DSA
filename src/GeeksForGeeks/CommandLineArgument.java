package GeeksForGeeks;

public class CommandLineArgument {
    public static void main(String[] args) {
//        System.out.println(args.length + 5);
//        if (args.length > 0) {
//            System.out.println("Arguments are: ");
//            for (String x : args) {
//                System.out.println(x + " ");
//            }
//        } else {
//            System.out.println("No arguments ");
//        }


        int i=2;
        while(i>=0){
            main(args);
            System.out.println("GFG");
            --i;
        }
    }

}
