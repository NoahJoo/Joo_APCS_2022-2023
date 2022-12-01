public class FizzBuzzForLoop {

    public static void main(String[] args) {

        for ( int = 1; int <= 100; i++ ) {
        if (i % 3 == 0 && i % 5 == 0) {

            System.out.println(+ i + " FizzBuzz");
            break;

        }   else if ( i % 3 == 0) {

            System.out.println(+i +" Fizz");

        }   else if ( i % 5 == 0) {

            System.out.println(+ i +" Buzz");

        }   else {

            System.out.println( +i );
            
        }
    }

    }
}