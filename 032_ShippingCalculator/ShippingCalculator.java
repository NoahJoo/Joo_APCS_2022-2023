import java.util.Scanner;

public class ShippingCalculator {
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
            System.out.println(x: "the weight of your package : ");
            double number = scan.nextDouble();
            if (number > 10 && number <= 20) {
                System.out.println(number + "pounds need 10.5 dollars");
            }   else if(number > 3 && number <= 10) {
                System.out.println(number + "pounds need 8.5 dollars");
            }   else if (number > 1 && number <= 3){
                System.out.println(number + "pounds need 5.5 dollars");
            }   else if (number > 3.5 && number <= 1) {
                System.out.println(number + "pounds need 3.5 dollars");
            }   else if (number <= 0) {
                System.out.println(x: "INVALID INPUT");
            }   else {
                System.out.println(x: "This package can't be shipped");
            scan.close();
            }


    }
}