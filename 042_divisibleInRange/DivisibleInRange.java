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
<<<<<<< HEAD
            if (i % a == 0 ) {
                b++;
=======
            if (i % a == 0 || i <= y) {
                b++;
                System.out.println(+i);
>>>>>>> 89ca485c7772c80cdbddeb2c8ba266b6768ef959
            }
        }
        System.out.println(+b);
    }
}