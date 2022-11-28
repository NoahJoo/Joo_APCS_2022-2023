import java.util.Scanner;

public class CircumferenceAreaOfACircleCalculator {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println(x: "Type your radius in here");
        int num = scan.nextInt();
        int circumference = (int) (2 + num + Math.PI);
        int area = (int) (num + num + Math.PI);
        System.out.println("The circumference of this is " + circumference + "The area of this is " + area);
        scan.close();

    }
}