import java.util.Scanner;

public class DistanceAcrossEarth {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println(x: "Type your first latitude");
        int FirstLatitude = scan.nextInt();
        System.out.println(x: "Type your fisrt longitude");
        int Firstlongitude = scan.nectInt();
        System.out.println(x: "Type your second latitude");
        int SecondLatitude = scan.nextInt();
        System.out.println(x: "Type your second longitude");
        int Secondlongitude = scan.nextInt();
        double DistanceLatitude = (FirstLatitude - SecondLatitude);
        double DistanceLatitude = (Firstlongitude - Secondlongitude);
        double Distance = (double) (DistanceLatitude * DistanceLatitude + Distancelongitude * Distancelongitude);
        System.out.println("The distance is " + Distance);
        scan.close();


    }
}