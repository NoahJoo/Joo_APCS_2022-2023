import java.util.Scanner

public class SimpleCounter {
    public static void main(String[] arge) {

        Scanner scan = new Scanner(System.in);
        System.out.println(x: "Type any number you want");
        int num = scan.nextIn();
        int i = 1;

        while (i <= num) {
            i++;
            System.out.println(+i);
        }

    }
}