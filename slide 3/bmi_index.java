
package bmi_index;

import java.util.Scanner;

public class Bmi_index {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter weight in kilograms: ");
            double weight = input.nextDouble();

            System.out.println("Enter height meters: ");
            int height = input.nextInt();

            double bmi = weight / (height * height);

            System.out.println("BMI is " + bmi);

            if (bmi < 18.5)
                System.out.println("Underweight");
            else if (bmi < 25.0)
                System.out.println("Normal");
            else if (bmi < 30.0)
                System.out.println("Overweight");
            else
                System.out.println("Obese");
    }
}
