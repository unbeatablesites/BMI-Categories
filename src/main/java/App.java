import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        askQuestion1();
        double heightINMeters = scan.nextDouble();
        askQuestion2();
        double weightInKg = scan.nextDouble();
        double bmi = weightInKg /(heightINMeters * heightINMeters) ;
        System.out.println("Your BMI is "+bmi);


        if(bmi < 15){
            System.out.println("BMI Category: very severely underweight\n");
        }else if(bmi >= 15 && bmi <= 16){
            System.out.println("BMI Category: severely underweight\n");
        }else if(bmi >= 16.1 &&  bmi <= 18.4){
            System.out.println("BMI Category: underweight");
        }else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("BMI Category: normal weight\n");
        }else if(bmi >= 25 && bmi <= 29.9){
            System.out.println("BMI Category: overweight");
        }else if(bmi >= 30 && bmi <= 34.9){
            System.out.println("BMI Category: moderately obese");
        }else if(bmi >= 35 && bmi <= 39.9){
            System.out.println("BMI Category: severely obese");
        }else {
            System.out.println("BMI Category: \tvery severely (or \"morbidly\") obese");
        }


    }

    public static void askQuestion1(){
        System.out.println("Your height in m:");
    }
    public static void askQuestion2(){
        System.out.println("Your weight in kg:");
    }

}
