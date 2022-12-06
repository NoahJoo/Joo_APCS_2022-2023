import java.util.Scanner;

public class DivisibleInRange {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        int a = 0;
        int b = 0;


        Scanner in = new Scanner(System.in);
        System.out.println( "Where do you want to start the range? input your value");
        x = in.nextInt();
        System.out.println( "where do you want to end the range? input your value");
        y = in.nextInt();
        System.out.println( "input the number you want to divide");
        a = in.nextInt();

        for (int i = x; i <= y; i++) {
            if (i % a == 0 ) {
                b++;
            }
        }
        System.out.println(+b);
    }
}