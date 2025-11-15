
package second_chapter_exercises;
import java.util.Scanner;
public class Second_chapter_exercises {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    // exercise 1 (converting celcius to farenhiet)
        
        System.out.println("enter temprature in celcius to convert into farenhiet:");
        double celcius = input.nextDouble();
        
        double farenhiet = ((9.0 / 5) * celcius) + 32;
        
        System.out.println("the " + celcius + " celcius degrees in farehiet is " + farenhiet + ".");
        
    //exercose 2 (compute volume of cylinder)

        System.out.println("Ente the radius of the cylinder:");
        double radiusOfCylinder = input.nextDouble();
        System.out.println("Enter the length of the cylinder:");
        double lengthOfCylinder = input.nextDouble();
        
        double areaOfCylinder = radiusOfCylinder * radiusOfCylinder * Math.PI;
        double volumeOfCylinder = areaOfCylinder * lengthOfCylinder; 
         
        System.out.println("the area of this cylinder is " + areaOfCylinder + " and volume of this cylinder is " + volumeOfCylinder);
        
    //exercise 3 (convert feet into meters)

        System.out.println("enter the amount of feets to convert it to meters:");
        float feets = input.nextFloat();
        
        float meters = feets * 0.305f;
        
        System.out.println(feets + " feets is equal to " +  meters + " meters.");
        
    //exercise 4 (convert pounds into kilograms)

        System.out.println("Enter amount of pounds to convert to kilograms:");
        float pounds = input.nextFloat();
        
        float kilograms = pounds * 0.454f;
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
        
    //exercise 5 (financial application: tips)

        System.out.println("Enter the subtotal price of the product:");
        int price = input.nextInt();
        
        System.out.println("Enter the gratuity percentage:");
        int percentage = input.nextInt();
        
        float gratuity = price * (percentage/100f);
        float total = price + gratuity;
        
        System.out.println("the gratuity is $" + gratuity + " and the total amount is $" + total);
        
    //exercise 6 (sum digits in an integer)
    
        System.out.println("Enter a number between 1 to 999 to sum up it's digits: ");
        int number = input.nextInt();
        
        int a,b,c;
        a = number%10;
        number /= 10;
        b = number%10;
        c = number/10;
       
        
        System.out.println("The sum of the digits of this number is: " + (a+b+c));
        
    //exercise 7 (find the number of years)

        System.out.println("Enter minutes to see how much years and days it is: ");
        double minutes = input.nextDouble();
        
        int years = (int)minutes / 525600;
        int remain = (int)minutes % 525600;
        int days = remain / 1440;
        
        System.out.println("This much minutes " + minutes + " is equal to " + years + " years and " + days + " days.");
        
    //exercise 8 (current time)
        
        System.out.println("Please enter your timezone based on GMT. \n"
                         + "first enter the hours:");
        int hours1 = input.nextInt();
        
        System.out.println("now enter the minutes:");
        int minutes1 = input.nextInt();
        
        System.out.println("your local time is: " + ShowCurrentTime.ShowCurrentTime(hours1, minutes1));
        
    //exercise 9 (acceleration)
        
        float v1, v2, t, averageAcceleration;
        System.out.println("enter the stating velocity:");
        v1 = input.nextFloat();
        
        System.out.println("enter current velocity:");
        v2 = input.nextFloat();
        
        System.out.println("enter the time span:");
        t = input.nextFloat();
        
        averageAcceleration = (v2 - v1) / t;
        System.out.println("the average acceleration is " + averageAcceleration);
        
    //exercise 10 (calculating energy)

        float water1, initialTemp, finalTemp, energy;
        System.out.println("enter amount of waters in kilograms:");
        water1 = input.nextFloat();
        
        System.out.println("enter the waters initial temperature:");
        initialTemp = input.nextFloat();
        
        System.out.println("enter the waters final temperature:");
        finalTemp = input.nextFloat();
        
        energy = water1 * (finalTemp - initialTemp) * 4184;
        
        System.out.println("amount of energy needed to heat the water is " + energy + " jouls.");
        
    //exercise 11 (population projection)

        System.out.println("this program will tell that how much is the population of the USA in the next years:");
        double current_population = 312032486;
        
        double birthPerYear = 4505142;
        double diePerYear = 2425846;
        double newImmigrants = 700800;
        
        double change = birthPerYear - diePerYear + newImmigrants;
         
        System.out.println("enter the number of years:");
        int numYears = input.nextInt();
        
        double population2 = (change * numYears) + current_population;
        
        System.out.println("after " + numYears + " years the population is " + population2);
        
    //exercise 12 (finding runway length)
    
        System.out.println("please enter the speed of the airplane in meters per second:");
        double speedOfPlane = input.nextDouble();
        
        System.out.println("please enter the acceleration of the airplane in meters per second square:");
        double accelerationPlane = input.nextDouble();
         
        double lengthOfRunway = (speedOfPlane * speedOfPlane) / (2 * accelerationPlane);
        
        System.out.println("the minimum length of the runway for taking off is " + lengthOfRunway);
        
    //exercise 13 (financial application: compound value)

        System.out.println("this program will say your account value for six months with 5% annual interest rate!\n"
                         + "enter the amount of monthly savings:");
        int monthlySaving = input.nextInt();
        
        double interestRate = 0.00417;
        double accountValue = 0;
        
        //after first month:
        double firstMonth1 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = firstMonth1;
        System.out.println("after first month account is " + firstMonth1);
        
        double secondMonth2 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = secondMonth2;
        System.out.println("after two months account is " + secondMonth2);
        
        double thirdMonth3 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = thirdMonth3;
        System.out.println("after three months account is " + thirdMonth3);
        
        double forthMonth4 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = forthMonth4;
        System.out.println("after four months account is " + forthMonth4);
        
        double fifthMonth5 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = fifthMonth5;
        System.out.println("after five months account is " + fifthMonth5);
        
        double sixthMonth6 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = sixthMonth6;
        System.out.println("after six month account is " + sixthMonth6);
        
    //exercise 14(Health application computing BMI)

        System.out.println("enter your weight in pounds:");
        double weightP = input.nextDouble();
        System.out.println("enter your height in inches:");
        double heightI = input.nextDouble();
        
        double BMI = (weightP * 0.45359237) / ((heightI * 0.0254) * (heightI * 0.0254));
        System.out.printf("BMI is %.4f\n", BMI);
        
    //exercise 15(distance between two points)

        System.out.println("enter the x1:");
        int x1 = input.nextInt();
        System.out.println("enter the y1:");
        int y1 = input.nextInt();
        
        System.out.println("enter the x2:");
        int x2 = input.nextInt();
        System.out.println("enter the y2:");
        int y2 = input.nextInt();
        
        double xcordinate = x2 - x1;
        double ycordinate = y2 - y1;
        
        double distance = Math.sqrt(Math.pow(xcordinate, 2) + Math.pow(ycordinate, 2));
        System.out.println("distance between these two points is " + distance);
        
    //exercise 16(area of hexagon)

        System.out.println("enter the length of one side of the hexagon to compute the area:");
        double sideHex = input.nextDouble();
        double areahex =  (3 * Math.sqrt(3) * sideHex * sideHex) / 2.0;
        System.out.println("the area of this hexagon is: " + areahex);
        
    //exercise 17(wind-chill temprature)

        System.out.println("enter the temprature in fahrenhiet between -58 and 41:");
        double degreeFah = input.nextDouble();
        System.out.println("enter the wind speed in miles per hour (should be greater than or equal to 2 miles per hour)");
        double windspeed = input.nextDouble();
        
        double windChill = 35.74 + (0.6215 * degreeFah) - (35.75 * Math.pow(windspeed, 0.16)) + (0.4275 * degreeFah * Math.pow(windspeed, 0.16));
        System.out.println("the windchill temprature is " + windChill);
        
    //exercise 18(printing a table)

        System.out.println("this program prints a table about pows"
                + "\n"
                + "\n");
        int first11 = (int) Math.pow(1, 2);
        int second22 = (int) Math.pow(2, 3);
        int third33 = (int) Math.pow(3, 4);
        int forth44 = (int) Math.pow(4, 5);
        int fifth55 = (int) Math.pow(5, 6);
        
        System.out.println("a         b        pow(a, b)\n"
                         + "1         2        " + first11 + "\n"
                         + "2         3        " + second22 + "\n"
                         + "3         4        " + third33 + "\n"
                         + "4         5        " + forth44 + "\n"
                         + "5         6        " + fifth55);
        
    //exercise 19 (area of a triangle)
        
        System.out.println("this program will compute the area of triangle by the three points");
        System.out.println("enter the x1");
        double x1_tri = input.nextDouble();
        System.out.println("enter the y1");
        double y1_tri = input.nextDouble();
        
        System.out.println("enter the x2");
        double x2_tri = input.nextDouble();
        System.out.println("enter the y2");
        double y2_tri = input.nextDouble();
        
        System.out.println("enter the x3");
        double x3_tri = input.nextDouble();
        System.out.println("enter the y3");
        double y3_tri = input.nextDouble();
        
        double side1 = distance(x1_tri, y1_tri, x2_tri, y2_tri);
        double side2 = distance(x1_tri, y1_tri, x3_tri, y3_tri);
        double side3 = distance(x2_tri, y2_tri, x3_tri, y3_tri);
        
        double s = (side1 + side2 + side3)/2d;
        double areaTriangle = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        
        System.out.println("the area is equal to " + areaTriangle);
        
    //execise 20(calculate interest)

        System.out.println("enter the balance:");
        double balance0 = input.nextDouble();
        System.out.println("enter the interest rate without the percentage:");
        double interestrate44 = input.nextDouble();
        
        double interest00 = balance0 * (interestrate44 / 1200.0);
        System.out.println("the interest is " + interest00);
        
    //exercise 21(financial applicaton: future investment value)
    
        System.out.println("enter your investment amount: ");
        double investAmount = input.nextDouble();
        System.out.println("enter annual interest rate in percentage:");
        double annual_interest = input.nextDouble();
        System.out.println("enter number of years:");
        double num_of_year = input.nextDouble();
        
        double future_value = investAmount * Math.pow((1 + (annual_interest/1200.0)), (num_of_year * 12));
        System.out.println("investment is " + future_value);
        
    //exercise 22(monetary units)

        System.out.println("enter the amount of cents to convert them to dollors and cents:");
        int total_cents = input.nextInt();
        
        int dollors = total_cents / 100;
        
        int cents = total_cents % 100;
        System.out.println("this much cents is equal to " + dollors + " dollors and " + cents + " cents");
        
    //exercise 23(cost of driving)    

        System.out.println("enter the distance you want to travel:");
        double distance_car = input.nextDouble();
        System.out.println("enter the car's usage of fuel in  miles per gallon:");
        double car_usage = input.nextDouble();
        System.out.println("enter the cost of each gallon of the fuel:");
        double fuel_cost = input.nextDouble();
        
        double fuel_total_cost = (distance_car / car_usage) * fuel_cost;
        System.out.println("the total cost will be: " + fuel_total_cost);
          
    }
    
    public static double distance(double x1, double y1, double x2, double y2){
    
        double distance = 0;
        
        double xcordinate = x2 - x1;
        double ycordinate = y2 - y1;
        
        distance = Math.sqrt(Math.pow(xcordinate, 2) + Math.pow(ycordinate, 2));
        
        return distance;
    }
}

class ShowCurrentTime {
    public static String ShowCurrentTime(int hour, int minute) {
    
        long totalMilliSecond = System.currentTimeMillis();
        long totalSecond = totalMilliSecond / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinute = (totalSecond / 60) + minute;
        long currentMinute = totalMinute % 60;
        long totalHour = (totalMinute / 60) + hour;
        long currentHour = totalHour % 24;
        
        String time = currentHour + ":" + currentMinute + ":" + currentSecond;
        
        return time;
    }
    
}
