import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        askQuestion1();
        double heightINMeters = scan.nextDouble();
        askQuestion2();
        double weightInKg = scan.nextDouble();
        double bmi = weightInKg /(heightINMeters * heightINMeters) ;

        System.out.println(bmi);

    }

    public static void askQuestion1(){
        System.out.println("Your height in m:");
    }
    public static void askQuestion2(){
        System.out.println("Your weight in kg:");
    }

}
