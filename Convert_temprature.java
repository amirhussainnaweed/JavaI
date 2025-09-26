package javahomework;

import java.util.Scanner;

public class Javahomework {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//Convert celicius to fahrenheit

        System.out.print("Enter the temprature in fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celicius = (5.0/9) * (fahrenheit - 32);

        System.out.println("The " + fahrenheit + " degree of fahrenheit is " + celicius + " degree of celicius." );
     }
 }
