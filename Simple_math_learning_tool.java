//Name: Amir Hussain Naweed 
//Instructor: Ahmad Roheed Khaliqyar
//Class: IS Department first semester
//Date: September 26, 2025
//This program is a simple math learning tool that generates randome numbers to test addition

package checking_number_division_on_2_and_3;

import java.util.Scanner;

public class Checking_number_division_on_2_and_3 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);

        int result = a + b;

        System.out.println("What is the result of " + a + "+" + b);
        int user_result = input.nextInt();

        if (result == user_result)
            System.out.println("Well done! Great!");
        else
            System.out.println("Wrong answer! Try again!");

    }

}
