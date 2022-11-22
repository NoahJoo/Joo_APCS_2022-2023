import java.util.Scanner; 

public class CarBuilderOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(x:"Type your year of the car you want");
        int year = scan.nextInt();
        System.out.println(x: "Type the mileage of the car you want");
        int mileage = scan.nextInt();
        System.out.println(x: "what is the mode of the car you want");
        String mode = scan.nextLine();
        System.out.println(x: "what is the model of the car you want");
        String modeUlane = scan.nextLine();
        System.out.println("We found "+year+mileage+mode+modeUlane);
        scan.close();
       

    }
}