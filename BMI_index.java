package checking_number_division_on_2_and_3;

import java.util.Scanner;

public class BMI_index {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms:");
        double weight = input.nextDouble();

        System.out.println("Enter your height in meters:");
        double height = input.nextDouble();

        double BMI = weight / (Math.pow(height, 2));

        if (BMI < 18.5)
            System.out.println("you are underweight!");
        else if (18.5 <= BMI && BMI < 25)
            System.out.println("you are normal!");
        else if (25 <= BMI && BMI < 30)
            System.out.println("you have overweight!");
        else if (30 <= BMI)
            System.out.println("you are obese!");

    }

}
