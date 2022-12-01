import java.util.Scanner;

public class DivisibleRange {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        int a = 0;
        int b = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println(x: "Where do you want to start the range? input your value");
        x = in.nextInt();
        System.out.println(y: "where do you want to end the range? input your value");
        y = in.nexInt();
        System.out.println(a: "input the number you want to divide");
        a = in.nextInt();

        for (int i = x; i <= y; i++) {
            if (i % a == 0 ) {
                b++
            }
        }
        System.out.println(+b);
    }
}