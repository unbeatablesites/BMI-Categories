import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        askQuestion1();
        int heightINMeters = scan.nextInt();
        askQuestion2();
        int weightInKg = scan.nextInt();
        int bmi = (heightINMeters * heightINMeters) / weightInKg;

    }

    public static void askQuestion1(){
        System.out.println("Your height in m:");
    }
    public static void askQuestion2(){
        System.out.println("Your weight in kg:");
    }

}
