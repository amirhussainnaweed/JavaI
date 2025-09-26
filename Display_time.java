//Name: Amir Hussain Naweed 
//Class: IS Department first semester
//Date: September 26, 2025
//This is a program that converts the entered amount of secnods into minutes and seconds


package seconds_to_minutes;

import java.util.Scanner;

public class Seconds_to_minutes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       System.out.println("Enter the amount of seconds to convert into minutes and seconds:");
       double total_seconds = input.nextDouble();
       double total_minutes = total_seconds / 60;
       double remaining_seconds = total_seconds % 60;
       System.out.println("This much seconds is equal to " + (int)total_minutes + " minutes and " + (int)remaining_seconds + " seconds.");
     }
 }
