
package first_chapter_exercises;

import java.util.Scanner;

public class First_Chapter_Exercises {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
    // exercise 1
        
        System.out.println("Welcome to java!");
        System.out.println("Welcome to Computer Science!");
        System.out.println("Programming is fun!");
        
    // exercise 2

        System.out.println("Welcome to java!");
        System.out.println("Welcome to java!");
        System.out.println("Welcome to java!");
        System.out.println("Welcome to java!");
        System.out.println("Welcome to java!");
        
    // exercise 3

        System.out.println("    J      A     V     V    A \n"
                         + "    J     A A     V   V    A A\n"
                         + "J   J    AAAAA     V V    AAAAA\n"
                         + " J J    A     A     V    A     A");
        
    // exercise 4

        System.out.println("a     a^2     a^3\n"
                         + "1      1       1\n"
                         + "2      4       8\n"
                         + "3      9       27\n"
                         + "4      16      64");
        
    // exercise 5

        double result = ((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5);
        System.out.println("the result is " + result);
        
    // exercise 6

        System.out.println("enter a number to calculate the summation from one to the selected number:");
        int num = input.nextInt();
        
        int sum = (num * (num + 1)) / 2;
        
        System.out.println("the sum of this numbers is " + sum);
        
    // exercise 7

        double pi_approximate1 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        double pi_approximate2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
        
        System.out.println("the first approximate pi value is " + pi_approximate1 + " and second approximate pi value is " + pi_approximate2 + ".");
        
    // exercise 8 

        System.out.println("enter the radius of the circle to calculate the perimeter and area:");
        double radius = input.nextDouble();
        
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.println("the perimeter of this circle is " + perimeter + " and the area of the circle is " + area + ".");
        
    // exercise 9

        System.out.println("this program will calculate the perimeter and area of a rectangle! \n"
                + "please enter the width of the rectangle:");
        double width = input.nextDouble();
        
        System.out.println("enter the length of the rectangle:");
        double lenght = input.nextDouble();
        
        double perimeterOfRectangle = 2 * (width + lenght);
        double areaOfRectangle = width * lenght;
        
        System.out.println("the perimeter of this rectangle is " + perimeterOfRectangle + " and area of this rectangle is " + areaOfRectangle + ".");
        
    // exercise 10

        System.out.println("a runner runs 14 kilometers in 45 minutes and 30 seconds.\n"
                + "this program will show this runners speed in miles per hour:");
        double distance = 14.0 / (1.6);
        double time = 45.5 / 60.0;
       
        double speed = distance / time;
        System.out.println("this runners average speed is " + speed + " miles per hour.");
       
    // exercise 11

        System.out.println("this program will tell that how much is the population of the USA in the next five years:");
        double current_population = 312032486;
        
        double birthPerYear = 4505142;
        double diePerYear = 2425846;
        double newImmigrants = 700800;
        
        double change = birthPerYear - diePerYear + newImmigrants;
        double firstYear = change + current_population;
        
        System.out.println("the population in next year is: " + (firstYear));
        
        double secondYear = (change * 2) + current_population;
        System.out.println("the population in second year is: " + secondYear);
        
        double thirdYear = (change* 3) + current_population;
        System.out.println("the population in third year is: " + thirdYear);
        
        double forthYear = (change * 4) + current_population;
        System.out.println("the population in forth year is: " + forthYear);
        
        double fifthYear = (change * 5) + current_population;
        System.out.println("the population in fifth year is: " + fifthYear);
        
    //exercise 12

        System.out.println("a runner runs 24 miles in 1 hour 40 minutes and 35 seconds.\n"
                + "this program will show the runners speed in kilometers per hour: ");
        
        double distanceInKilometers = 24 * 1.6;
        double time2 = 1.676383;
        
        double speedInKilometers = distanceInKilometers / time2;
        
        System.out.println("the speed is " + speedInKilometers + " kilometers per hour.");
        
    // exercise 13

        System.out.println("this program will solve this linear equation:\n"
                         + "3.4x + 50.2y = 44.5\n"
                         + "2.1x + 5.5y = 5.9");
        if(((3.4 * 5.5) - (50.2 * 2.1)) != 0){
            double x = ((44.5 * 5.5) - (50.2 * 5.9)) / ((3.4 * 5.5) - (50.2 * 2.1));
            double y = ((3.4 * 5.9) - (2.1 * 44.5)) / ((3.4 * 5.5) - (50.2 * 2.1));
            
            System.out.println("the x value is " + x + " and y value is " + y);
        }
        else 
            System.out.println("this equation doesnt have any solution!");
        
        
    }
    
}
