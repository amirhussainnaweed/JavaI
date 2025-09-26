//Name: Amir Hussain Naweed 
//Instructor: Ahmad Roheed Khaliqyar
//Class: IS Department first semester
//Date: September 26, 2025
//This is a program that randomly generates two numbers to test the subtraction skill of students

package checking_number_division_on_2_and_3;

import java.util.Scanner;

public class Improved_math_learning_tool_for_subtraction {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);

        if (a >= b) {
            int result = a - b;
            System.out.println("What is the result of " + a + " - " + b);
            int user_result = input.nextInt();
            if (result == user_result)
                System.out.println("Well done!");
            else
                System.out.println("Wrong answer! try again!");
        }
        else if (b >= a) {
            int result = b - a;
            System.out.println("What is the result of " + b + " - " + a);
            int user_result = input.nextInt();
            if (result == user_result)
                System.out.println("Well done!");
            else
                System.out.println("Wrong answer! try again!");
        }

    }

}
