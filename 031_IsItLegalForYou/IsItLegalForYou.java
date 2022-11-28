import java.util.Scanner;

public class IsItLegalForYou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(x: "Type your age to see what you can do: enroll in Medicare, Run for President, rent a Car, buy alcohol, buy cigaretti in the state of Minnesota.");
        System.out.println(x: "Type your age here :");
        int number = scan.nextInt();

        if (number >= 65) {
            System.out.println(x: "You can enroll in Medicare, Run for President, rent a car, buy alcohol, buy a cigaretti. ")
        }   else if (number >= 35) {
            System.out.println(x: "you can run for President, rent a Car, buy alcohol, buy cigaretti in the state of Minnesota.");
        }   else if (number >= 25) {
            System.out.println(x: "you can rent a Car, go to a casino, buy alcohol, buy cigaretti in the state of Minnesota");
        }   else if (number >= 21) {
            System.out.println(x: "you can buy a alcohol, buy a cigaretti, go to casino, get a driver's license");
        }   else if (number >= 18) {
            System.out.println(x: "you can go to a casino, get a driver's license, get a job");
        }   else if (number >= 16) {
            System.out.println(x: "You can get a driver's license, and get a job");
        }   else if (number >= 14) {
            System.out.println(x: "You can get a job");
        }   else {
            System.out.println(x: "you can not do anything of this");
                scan.close();
        }

    }
}