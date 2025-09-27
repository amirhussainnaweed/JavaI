

package javahomework;

import java.util.Scanner;

public class Javahomework {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
//Area of a circle:
        
        
        
        System.out.println("Enter a number for Radius: ");
        
        double radius = input.nextDouble();
        
        double area = radius * radius * Math.PI;
        
        System.out.println("The area for this circle is " + area);
        
        
// perimeter of Rectangle:
        
        
        System.out.print("Enter the width of Rectangle: ");
        double width = input.nextDouble();
        
        System.out.print("Enter the length of Rectangle: ");
        double length = input.nextDouble();
        
        double perimeter = (2 * width + 2 * length);
        
        System.out.print("The perimeter of this Rectangle is " + perimeter);
        
        
// Swap two numbers:
        
        
        
        System.out.print("Enter the firsr number: ");
        double a = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("The second number is now the first one: " + a 
        + " and the first number is right now the second number: " + b);
        
        
// Simple imterest:
        
        
        System.out.print("Enter the principle: ");
        double principle = input.nextDouble();
        
        System.out.print("Enter the rate without percentage : ");
        double rate = input.nextDouble();
        
        System.out.print("Enter the number of years: ");
        double time = input.nextDouble();
        
        double interest = (principle * rate * time)/(100);
        
        System.out.println("The interest after " + time + " years is " + interest);
        
        double total = (interest + principle);
        System.out.println("The total principle is " + total);
           
        
// Even or odd number:
        
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        double remainder = number % 2;
        
        if (remainder == 0) {
            System.out.println("This is an even number.");
        } else {
            System.out.println("This is an odd number."); }
        
        
// Sum of first N natural numbers:
        
        
        System.out.println("Enter a natural number to measure the sum: ");
        double N = input.nextDouble();
        
        double sum = (N * (N + 1))/2;
        
        System.out.println("The sum of it is: " + sum);
        
        
//Convert celicius to fahrenheit
        
        
        System.out.print("Enter the temprature in fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celicius = (5.0/9) * (fahrenheit - 32);
        
        System.out.println("The " + fahrenheit + " degree of fahrenheit is " + celicius + " degree of celicius." );
        
        
//Maximum of two numbers:
        
        
        
        System.out.print("Enter a number between 0 to 9: ");
        int a2 = input.nextInt();
        
        System.out.print("Enter another number between 0 to 9: ");
        int b2 = input.nextInt();
        
        System.out.println("The maximum number made with combinition of these two numbers is: ");
        
        if(a2 >= b2) {
            System.out.print(a);
            System.out.println(b2); }
        else if (b2 > a2) {
            System.out.print(b2);
            System.out.println(a2); }   
        
        
        
        System.out.println("Enter a number: ");
        double a1 = input.nextDouble();
        
        System.out.println("Enter another number: ");
        double b1 = input.nextDouble();
        
        if (a1 > b1) {
            System.out.println(a1 +" is the greater number.");}
        else if(b1 > a1) {
            System.out.println(b1 +"is the greater number.");}
        
        
// Leap year checking: 
        
        
        System.out.println("Enter a year to check if it is a leap year: ");
        double leap = input.nextDouble();
        
        double remainder1 = leap % 4;
        
        if (remainder1 == 3) {
            System.out.println("This year is a leap year! ");}
        else {
            System.out.println("This year is NOT a leap year! ");}
        
        
// Reverse a number:
        
        
        System.out.println("Enter the digits of a three digit number in row:");
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        
        System.out.print("The number is " + A);
        System.out.print(B);
        System.out.println(C);
        
        System.out.print("The reversed number is " + C);
        System.out.print(B);
        System.out.println(A);
        
        
        
        System.out.println("Enter an interger: ");
        int number1 = input.nextInt();
        int reversed = 0;
        
        while (number1 != 0) {
        int digit = number1 % 10;
        reversed = reversed * 10 + digit;
        number1 = number1/10; }
        
        System.out.println("The reversed version of this number is " + reversed);
        
        
        
    }
    
}
