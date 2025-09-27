//Name: Amir Hussain Naweed 
//Instructor: Ahmad Roheed Khaliqyar
//Class: IS Department first semester
//Date: September 27, 2025
//This is a program that checks if a year is a leap year or not? The year input should be in AD.

package leap_year_checking;

import java.util.Scanner;

public class Leap_year_checking {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a year in AD to check if it is a leap year: ");
        int year = input.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("This is a leap year! ");
        else 
            System.out.println("This is not a leap year! ");
    }
    
}
