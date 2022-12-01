import java.util.Scanner

public class FizzBuzzWhileLoop {

    public static void main(String[] args) {
        
        int i = 0;
        
        while (i <= 100) {
            i++
        if ( (i % 3) == 0 && (i % 5) == 0 ) {
            System.out.println(+i + " FizzBuzz");
            break;
        }   else if ( i % 3 == 0) {
            System.out.println(+i + " Fizz");
        }   else if ( i % 5 == 0) {
            System.out.println(+i + " Buzz");
        }   else {
            System.out.println(+i);
        }
        }

    }
}¡