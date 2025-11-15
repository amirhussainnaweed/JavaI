
package third_chapter_exercises;
import java.util.Scanner;

public class Third_chapter_exercises {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    //exercise 1 (quadritic equation roots)
        
             
            System.out.println("Enter a number for the x^2 multiple: ");
            double a = input.nextDouble();
             
            System.out.println("Enter a number for the x multiple: ");
            double b = input.nextDouble();
             
            System.out.println("Enter a number for the constant: ");
            double c = input.nextDouble();
             
            double x1 = (-b + Math.sqrt(b * b - 4 * a * c))/(2 * a);
             
            double x2 = (-b - Math.sqrt(b * b - 4 * a * c))/(2 * a);
            
            if ((b * b - 4 * a * c) == 0)
                System.out.println("the solution is " + x1);
            else if ((b * b - 4 * a * c) > 0) {
                System.out.println("The first solution for x is " + x1);
                System.out.println("The second solution for x is " + x2);
            }
            else if((b * b - 4 * a * c) < 0)
                System.out.println("the equation doesnt have real solution!");
            
    //exercise 2 (add three numbers) 
        
            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);
            int num3 = (int)(Math.random() * 10);
            
            int compResult = num1 + num2 + num3;
            System.out.println("what is the result of " + num1 + " + " + num2 + " + " + num3 + "?");
            int userResult = input.nextInt();
            
            if (compResult == userResult)
                System.out.println("that was correct!");
            else 
                System.out.println("wrong answer!");
            
    //exercise 3(2 x 2 linear equation)
        
            System.out.println("Enter a, b, c, d, e, f in order: ");
            double a3 = input.nextDouble();
            double b3 = input.nextDouble();
            double c3 = input.nextDouble();
            double d3 = input.nextDouble();
            double e3 = input.nextDouble();
            double f3 = input.nextDouble();

            double determinant = a3 * d3 - b3 * c3;

            if (determinant == 0) {
                System.out.println("The equation has no solution.");
            } else {
                double x3 = (e3 * d3 - b3 * f3) / determinant;
                double y3 = (a3 * f3 - e3 * c3) / determinant;

                System.out.println("x is " + x3 + " and y is " + y3);
            }
        
    //exercise 4(random month)
        
            int randomMonth = (int)((Math.random() * 12) + 1);
            String monthName = "";
            switch (randomMonth){
                case 1: monthName = "January"; break;
                case 2: monthName = "February"; break;
                case 3: monthName = "March"; break;
                case 4: monthName = "April"; break;
                case 5: monthName = "May"; break;
                case 6: monthName = "June"; break;
                case 7: monthName = "July"; break;
                case 8: monthName = "August"; break;
                case 9: monthName = "September"; break;
                case 10: monthName = "October"; break;
                case 11: monthName = "November"; break;
                case 12: monthName = "December";
            }
            System.out.println(monthName);
            
    //exercise 5 (finding future dates)
        
            System.out.println("enter today's day:");
            int todaysDay = input.nextInt();
            System.out.println("enter the number of days elapsed since today:");
            int elapsedDays = input.nextInt();
            
            int totalDays = todaysDay + elapsedDays;
            if (totalDays >= 7){
                int cc = totalDays % 7;
                switch (cc){
                    case 0: System.out.println("saturday"); break;
                    case 1: System.out.println("sunday"); break;
                    case 2: System.out.println("monday"); break;
                    case 3: System.out.println("tuesday"); break;
                    case 4: System.out.println("wednesday"); break;
                    case 5: System.out.println("thursday"); break;
                    case 6: System.out.println("friday"); break;
                }
            }
            else if(totalDays < 7){
                switch (totalDays){
                    case 0: System.out.println("saturday"); break;
                    case 1: System.out.println("sunday"); break;
                    case 2: System.out.println("monday"); break;
                    case 3: System.out.println("tuesday"); break;
                    case 4: System.out.println("wednesday"); break;
                    case 5: System.out.println("thursday"); break;
                    case 6: System.out.println("friday"); break;
                }
            }
           
    //exercise 6 (BMI index asking from user)
        
            System.out.println("Enter weight in pounds: ");
            double weight = input.nextDouble();

            System.out.println("Enter height feet: ");
            int feet = input.nextInt();
            System.out.println("enter the inchese:");
            int inches = input.nextInt();

            int totalInches = feet * 12 + inches;

            double weightInKilograms = weight * 0.45359237;
            double heightInMeters = totalInches * 0.0254;

            double bmi = weightInKilograms / (heightInMeters * heightInMeters);

            System.out.println("BMI is " + bmi);

            if (bmi < 18.5)
                System.out.println("Underweight");
            else if (bmi < 25.0)
                System.out.println("Normal");
            else if (bmi < 30.0)
                System.out.println("Overweight");
            else
                System.out.println("Obese");
            
    //exercise 7(financial problem)
        
            System.out.println("Enter total amount of cents: ");
            int totalCents = input.nextInt();
 

            int numberOfOneDollars = totalCents / 100;
            totalCents = totalCents % 100;

            int numberOfQuarters = totalCents / 25;
            totalCents = totalCents % 25;

            int numberOfDimes = totalCents / 10;
            totalCents = totalCents % 10;

            int numberOfNickels = totalCents / 5;
            totalCents = totalCents % 5;

            int numberOfPennies = totalCents;

            if (numberOfOneDollars > 0)
                System.out.println(numberOfOneDollars + " " + (numberOfOneDollars == 1 ? "dollar" : "dollars"));

            if (numberOfQuarters > 0)
                System.out.println(numberOfQuarters + " " + (numberOfQuarters == 1 ? "quarter" : "quarters"));

            if (numberOfDimes > 0)
                System.out.println(numberOfDimes + " " + (numberOfDimes == 1 ? "dime" : "dimes"));

            if (numberOfNickels > 0)
                System.out.println(numberOfNickels + " " + (numberOfNickels == 1 ? "nickel" : "nickels"));

            if (numberOfPennies > 0)
                System.out.println(numberOfPennies + " " + (numberOfPennies == 1 ? "penny" : "pennies"));
            
    //exercise 8 (sorting three integers)
        
            System.out.println("enter the first integer:");
            int one1 = input.nextInt();
            System.out.println("enter the second integer:");
            int two2 = input.nextInt();
            System.out.println("enter the third integer:");
            int three3 = input.nextInt();
            
            if (one1 > two2 && one1 > three3 && two2 > three3)
                System.out.println(one1 + " > " + two2 + " > " + three3);
            else if (two2 > one1 && two2 > three3 && one1 > three3)
                System.out.println(two2 + " > " + one1 + " > " + three3);
            else if (three3 > one1 && three3 > two2 && one1 > two2)
                System.out.println(three3 + " > " + one1 + " > " + two2);
            else if (one1 > three3 && one1 > two2 && three3 > two2)
                System.out.println(one1 + " > " + three3 + " > " + two2);
            else if (two2 > three3 && two2 > one1 && three3 > one1)
                System.out.println(two2 + " > " + three3 + " > " + one1);
            else if (three3 > two2 && three3 > one1 && two2 > one1)
                System.out.println(three3 + " > " + two2 + " > " + one1);
            
    //exercise 9 (business: check ISBN 10)
        
            System.out.println("enter the 9 digit of ISBN:");
            int nineISBN = input.nextInt();
            final int nineISBNFinal = nineISBN;
            
            
            int d9 = nineISBN % 10;
            nineISBN /= 10;
            int d8 = nineISBN % 10;
            nineISBN /= 10;
            int d7 = nineISBN % 10;
            nineISBN /= 10;
            int d6 = nineISBN % 10;
            nineISBN /= 10;
            int d5 = nineISBN % 10;
            nineISBN /= 10;
            int d4 = nineISBN % 10;
            nineISBN /= 10;
            int d3_ = nineISBN % 10;
            nineISBN /= 10;
            int d2 = nineISBN % 10;
            int d1 = 0;
            
            int tenISBN = ((d1 * 1) + (d2 * 2) + (d3_ * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + ( d9 * 9)) % 11;
            
            if (tenISBN == 10)
                System.out.println("0" + nineISBNFinal + "X");
            else if (tenISBN < 10)
                System.out.println("0" + nineISBNFinal + "" + tenISBN);
            
    //exercise 10 (addition quiz)
        
            int number1 = (int) (Math.random() * 100);
            int number2 = (int) (Math.random() * 100);
            
            int compresult10 = number1 + number2;
            
            System.out.println("what is the result of " + number1 + " + " + number2 + "?" );
            int userresult10 = input.nextInt();
            
            if(compresult10 == userresult10)
                System.out.println("correct!");
            else 
                System.out.println("wrong!");
            
    //exercise 11 (find number of days in month)
        
            System.out.println("enter the month as a number between 1 to 12");
            int month11 = input.nextInt();
            System.out.println("enter the year");
            int year11 = input.nextInt();
            
            boolean febr = ((year11 % 400 == 0) || (year11 % 4 == 0 && year11 % 100 != 0)); 
            String monthName11 = "";
            
            switch (month11){
                case 1: monthName11 = "January"; break;
                case 2: monthName11 = "February"; break;
                case 3: monthName11 = "March"; break;
                case 4: monthName11 = "April"; break;
                case 5: monthName11 = "May"; break;
                case 6: monthName11 = "June"; break;
                case 7: monthName11 = "July"; break;
                case 8: monthName11 = "August"; break;
                case 9: monthName11 = "September"; break;
                case 10: monthName11 = "October"; break;
                case 11: monthName11 = "November"; break;
                case 12: monthName11 = "December";
            }
            
            int daysnumber = 0;
            if (month11 == 1 || month11 == 3 || month11 == 5 || month11 == 7 || month11 == 8 || month11 == 10 || month11 == 12)
                daysnumber =  31;
            else if (month11 == 4 || month11 == 6 || month11 == 9 || month11 == 11)
                daysnumber = 30;
            else if (month11 == 2) 
                daysnumber = febr? 29: 28;
            
            System.out.println(monthName + " " + year11 + " has " + daysnumber + " days");
            
    //exercise 12 (palindrome integer)
        
            System.out.println("enter a three digit integer to check if it is palindrome:");
            int threedigit12 = input.nextInt();
            
            int firstdigit = threedigit12 / 100;
            int lastdigit = threedigit12 % 10;
            
            if (firstdigit == lastdigit)
                System.out.println(threedigit12 + " is palindrome");
            else 
                System.out.println(threedigit12 + " is not palindrome");
            
    //exercise 13 (financial application: compute taxes)
        
            System.out.println("Choose one number for your marital status:"
                             + "\nSingle = 0"
                             + "\nMarried filing jointly = 1"
                             + "\nMarried filing saperately = 2"
                             + "\nHead of household = 3 ");
            int status = input.nextInt();
            System.out.println("Enter your salary: ");
            int salary = input.nextInt();
            double tax = 0;
            
            switch (status) {
            case 0: {
                if (salary >= 0 && salary <= 8350) 
                    tax = salary * 0.10;
                else if (salary >= 8351 && salary <= 33950) 
                    tax = salary * 0.15;
                else if (salary >= 33951 && salary <= 82250) 
                    tax = salary * 0.25;
                else if (salary >= 82251 && salary <= 171550) 
                    tax = salary * 0.28;
                else if (salary >= 171551 && salary <= 372950) 
                    tax = salary * 0.33;
                else if (salary >= 372951) 
                    tax = salary * 0.35;
                System.out.println("Your tax is " + tax);
                
                break;
            }
            case 1: {
                if (salary >= 0 && salary <= 16700) 
                    tax = salary * 0.10;
                else if (salary >= 16701 && salary <= 67900) 
                    tax = salary * 0.15;            
                else if (salary >= 67901 && salary <= 137050) 
                    tax = salary * 0.25;
                else if (salary >= 137051 && salary <= 208850) 
                    tax = salary * 0.28;
                else if (salary >= 208851 && salary <= 372950) 
                    tax = salary * 0.33;
                else if (salary >= 372951) 
                    tax = salary * 0.35;
                System.out.println("Your tax is " + tax);
                
                break;
            }
            case 2: {
                if (salary >= 0 && salary <= 8350) 
                    tax = salary * 0.10;
                else if (salary >= 8351 && salary <= 33950) 
                    tax = salary * 0.15;
                else if (salary >= 33951 && salary <= 68525) 
                    tax = salary * 0.25;
                else if (salary >= 68526 && salary <= 104425)
                    tax = salary * 0.28;
                else if (salary >= 104426 && salary <= 186475) 
                    tax = salary * 0.33;
                else if (salary >= 186476) 
                    tax = salary * 0.35;
                System.out.println("Your tax is " + tax);
                
                break;
            }
            case 3: {
                if (salary >= 0 && salary <= 11950) 
                    tax = salary * 0.10;
                else if (salary >= 11951 && salary <= 45500)
                    tax = salary * 0.15;
                else if (salary >= 45501 && salary <= 117450) 
                    tax = salary * 0.25;
                else if (salary >= 117451 && salary <= 190200) 
                    tax = salary * 0.28;
                else if (salary >= 190201 && salary <= 372950) 
                    tax = salary * 0.33;
                else if (salary >= 372951) 
                    tax = salary * 0.35;
                System.out.println("Your tax is " + tax);
                
                break;
            }
            default: System.out.println("Please enter a correct number based on your marital status! ");
                    
                System.exit(1);
            }
            
    //exercise 14 (heads or tails)
    
            int headortail = (int) (Math.random() * 2);
            
            System.out.println("guess if it's head or tail?\n"
                             + " 1 for head and 0 for tail");
            int userguess14 = input.nextInt();
            
            if ((headortail == userguess14) && headortail == 1)
                System.out.println("great it was tail");
            else if ((headortail == userguess14) && headortail == 0)
                System.out.println("great it was head");
            else 
                System.out.println("wrong guess!");
            
    //exercise 15 (Game: lottery)
    
            int comp_num = (int)(Math.random() * 100);
            System.out.println("Enter a two digit number: ");
            int user_num = input.nextInt();
        
            int a15 = comp_num / 10;
            int b15 = comp_num % 10;
        
            int c15 = user_num / 10;
            int d15 = user_num % 10;
            
            if ((c15 == a15) && (b15 == d15))
                System.out.println("That was correct and you won 10000 US Dollors! ");
            else if ((c15 == b15) && (d15 == a15))
                System.out.println("The order wasn't correct but the digits were correct so you won 3000 US Dollors! ");
            else if ((c15 == a15) || (d15 == b15))
                System.out.println("Only one digit was correct so you won 1000 US Dollors! ");
            else if ((c15 == b15) || (d15 == a15))
                System.out.println("Only one digit was correct so you won 1000 US Dollors!");
            else 
                System.out.println("Unfortunately the number you entered didn't match the auto generated number.");
            
    //exercise 16 (random point)
    
            int pointx = (int)((Math.random() * 201) - 100);
            int pointy = (int)((Math.random() * 101) - 50);
            
            System.out.println("random point that is inside the rectangle is:");
            System.out.println("(" + pointx + "," + pointy + ")");
            
    //exercise 17 (game: scissors, rock and paper)
    
            int compchoice = (int)(Math.random() * 3);
            System.out.println("choose scissors (0) rock (1) and paper (2)");
            int userchoice = input.nextInt();
            
            if(compchoice == 0){
                if(userchoice == 0)
                    System.out.println("computer is also scissors. It is a draw");
                else if(userchoice == 1)
                    System.out.println("computer was scissors, you are rock, you won");
                else if(userchoice == 2)
                    System.out.println("computer was scissors, you are paper, computer won");
            }
            else if(compchoice == 1){
                if(userchoice == 0)
                    System.out.println("computer was rock, you are scissors, so computer won");
                else if(userchoice == 1)
                    System.out.println("computer was rock, you are also rock, it is a draw");
                else if(userchoice == 2)
                    System.out.println("computer was rock, you are paper, so you won");
            }
            else if(compchoice == 2){
                if(userchoice == 0)
                    System.out.println("computer was paper, you are scissors, so you won");
                else if(userchoice == 1)
                    System.out.println("computer was paper, you are rock, so computer won");
                else if(userchoice == 2)
                    System.out.println("computer was paper, you are also paper, so it is a draw");
            }
            
    //exercise 18 (cost of shipping)
    
            System.out.println("enter the wieght of the package to display the cost of shipping");
            int packageWeight = input.nextInt();
            
            if(packageWeight > 0 && packageWeight <= 1)
                System.out.println("the cost is $3.5");
            else if(packageWeight > 1 && packageWeight <= 3)
                System.out.println("the cost is $5.5");
            else if(packageWeight > 3 && packageWeight <= 10)
                System.out.println("the cost is $8.5");
            else if(packageWeight > 10 && packageWeight <= 20)
                System.out.println("the cost is $10.5");
            else if (packageWeight > 20)
                System.out.println("the package can not be shipped!");
            else 
                System.out.println("an invalid value was entered");
            
    //exercise 19 (compute triangle perimeter)
            
            System.out.println("enter the first edge of the triangle:");
            int firstEdge = input.nextInt();
            System.out.println("enter the second edge of the triangle:");
            int secondEdge = input.nextInt();
            System.out.println("enter the third edge of the triangle:");
            int thirdEdge = input.nextInt();
            
            if(((firstEdge + secondEdge) > thirdEdge) && ((firstEdge + thirdEdge) > secondEdge) && ((secondEdge + thirdEdge) > firstEdge))
                System.out.println("the perimeter is " + (firstEdge + secondEdge + thirdEdge));
            else 
                System.out.println("the input was invalid");
            
    //exercise 20 (wind chill temprature)
    
            System.out.println("enter the temprature in fahrenhiet between -58 and 41:");
            double degreeFah = input.nextDouble();
            System.out.println("enter the wind speed in miles per hour (should be greater than or equal to 2 miles per hour)");
            double windspeed = input.nextDouble();
            
            if((degreeFah >= -58 && degreeFah <= 41) && (windspeed >= 2)){
                double windChill = 35.74 + (0.6215 * degreeFah) - (35.75 * Math.pow(windspeed, 0.16)) + (0.4275 * degreeFah * Math.pow(windspeed, 0.16));
                System.out.println("the windchill temprature is " + windChill);
            }
            else if((degreeFah < -58 || degreeFah > 41) && windspeed < 2) 
                System.out.println("the temprature and speed are not in the range!");
            else if ((degreeFah < -58 || degreeFah > 41))
                System.out.println("the temprature is not in the range!");
            else if(windspeed < 2)
                System.out.println("the wind speed is not in the range!");
            
    //exercise 21 (Science: day of the week)
    
            System.out.println("enter the year");
            int year21 = input.nextInt();
            System.out.println("enter the month in form of numbers from 1 to 12");
            int month21 = input.nextInt();
            System.out.println("enter the day of the month:");
            int daymonth21 = input.nextInt();
            
            
            if (month21 == 1){
                month21 = 13;
                year21 -= 1;
            }
            else if(month21 == 2){
                month21 = 14;
                year21 -= 1;
            }
            
            int h = ((daymonth21 + ((26 * (month21 + 1)) / 10) + (year21 % 100) + ((year21 % 100) / 4) + ((year21 / 100) / 4) + ((year21 / 100) * 5)) % 7); 
            
            String dayname21 = "";
            switch(h){
                case 0: dayname21 = "saturday"; break;
                case 1: dayname21 = "sunday"; break;
                case 2: dayname21 = "monday"; break;
                case 3: dayname21 = "tuesday"; break;
                case 4: dayname21 = "wednesday"; break;
                case 5: dayname21 = "thursday"; break;
                case 6: dayname21 = "friday"; break;
            }
            System.out.println("day of the week is " + dayname21);
            
            
    //exercise 22 (point in a circle)
    
            System.out.println("enter the cordinate of x");
            double xcor22 = input.nextDouble();
            System.out.println("enter the cordinate of y");
            double ycor22 = input.nextDouble();
            
            double distance22 = Math.sqrt(Math.pow(xcor22, 2) + Math.pow(ycor22, 2));
            if (distance22 < 10)
                System.out.println("the point is inside the circle");
            else if(distance22 == 10)
                System.out.println("the point is on the perimeter of the circle");
            else if(distance22 > 10)
                System.out.println("the point is outside of the circle");
            
    //exercise 23 (point in a rectangle)
    
            System.out.println("enter the coordinate of x");
            double xcor23 = input.nextDouble();
            System.out.println("enter the coordinate of y");
            double ycor23 = input.nextDouble();
            
            xcor23 = Math.abs(xcor23);
            ycor23 = Math.abs(ycor23);
            
            if(xcor23 < 5.0 && ycor23 < 2.5)
                System.out.println("the point is inside the rectangle");
            else
                System.out.println("the point is outside of the rectangle");
            
    //exercise 24 (pick a card)
    
            System.out.println("pick a card:\n"
                    + "first choose the rank:\n"
                    + "\n"
                    + "(write 1 for Ace), 2, 3, 4, .... , 10, (write 11 for jack, 12 for queen and 13 for king)");
            int rankofcard = input.nextInt();
            System.out.println("now pick the suit:\n"
                    + "wite 1 for clubs, 2 for diamonds, 3 for hearts, and 4 for spades");
            int suitofcard = input.nextInt();
            
            String rankName = "";
            switch (rankofcard){
                case 1: rankName = "Ace"; break;
                case 2: rankName = "2"; break;
                case 3: rankName = "3"; break;
                case 4: rankName = "4"; break;
                case 5: rankName = "5"; break;
                case 6: rankName = "6"; break;
                case 7: rankName = "7"; break;
                case 8: rankName = "8"; break;
                case 9: rankName = "9"; break;
                case 10: rankName = "10"; break;
                case 11: rankName = "Jack"; break;
                case 12: rankName = "Queen"; break;
                case 13: rankName = "King"; break;
            }
            String suitName = "";
            switch (suitofcard){
                case 1: suitName = "Clubs"; break;
                case 2: suitName = "Diamonds"; break;
                case 3: suitName = "Hearts"; break;
                case 4: suitName = "Spades"; break;
            }
            System.out.println("the card you picked is " + rankName + " of " + suitName);
            
    //exercise 25 (intersecting point)
    
            System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
            double x125 = input.nextDouble();
            double y125 = input.nextDouble();
            double x225 = input.nextDouble();
            double y225 = input.nextDouble();
            double x325 = input.nextDouble();
            double y325 = input.nextDouble();
            double x425 = input.nextDouble();
            double y425 = input.nextDouble();

            
            double a125 = y125 - y225;
            double b125 = -(x125 - x225);
            double c125 = a125 * x125 + b125 * y125;

            double a225 = y325 - y425;
            double b225 = -(x325 - x425);
            double c225 = a225 * x325 + b225 * y325;

            double det = a125 * b225 - a225 * b125;

            if (det == 0) {
                System.out.println("The two lines are parallel.");
            } else {
                double x25 = (c125 * b225 - c225 * b125) / det;
                double y25 = (a125 * c225 - a225 * c125) / det;
                System.out.printf("The intersecting point is at (%.5f, %.5f)%n", x25, y25);
            }
            
    //exercise 26 (using the operators to determine if a number is divisible by 5 and 6)
    
            System.out.println("enter a number to see if it is divisible by 5 and 6:");
            int numberToDivide = input.nextInt();
        
            System.out.println("is it divisible by 5 and 6:");
            boolean result25 = (numberToDivide % 5 == 0 && numberToDivide % 6 == 0);
            System.out.println(result25);
            System.out.println("is it divisible by 5 or 6:");
            result25 = (numberToDivide % 5 == 0 || numberToDivide % 6 == 0);
            System.out.println(result25);
            System.out.println("is it divisible by 5 or 6 but not both:");
            result25 = (numberToDivide % 5 == 0 ^ numberToDivide % 6 == 0);
            System.out.println(result25);
            
    //exercise 27 (point inside the triangle)
    
            System.out.print("Enter a point's x- and y-coordinates: ");
            double x = input.nextDouble();
            double y = input.nextDouble();

            boolean inside = (x >= 0) && (y >= 0) && (y <= (-0.5 * x + 100));

            if (inside) {
                System.out.println("The point is inside the triangle.");
            } else {
                System.out.println("The point is not inside the triangle.");
            }
            
    //exercise 28 (two rectangles)
    
            System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
            double x128 = input.nextDouble();
            double y128 = input.nextDouble();
            double w128 = input.nextDouble();
            double h128 = input.nextDouble();

            System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
            double x228 = input.nextDouble();
            double y228 = input.nextDouble();
            double w228 = input.nextDouble();
            double h228 = input.nextDouble();

            double dx28 = Math.abs(x128 - x228);
            double dy28 = Math.abs(y128 - y228);

            if (dx28 <= (w128 / 2 - w228 / 2) && dy28 <= (h128 / 2 - h228 / 2)) {
                System.out.println("r2 is inside r1");
            } else if (dx28 <= (w128 / 2 + w228 / 2) && dy28 <= (h128 / 2 + h228 / 2)) {
                System.out.println("r2 overlaps r1");
            } else {
                System.out.println("r2 does not overlap r1");
            }
            
    //exercise 29 (two circles)
    
            System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
            double x129 = input.nextDouble();
            double y129 = input.nextDouble();
            double r129 = input.nextDouble();

            System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
            double x229 = input.nextDouble();
            double y229 = input.nextDouble();
            double r229 = input.nextDouble();

            double dx29 = x129 - x229;
            double dy29 = y129 - y229;
            double distance = Math.sqrt(dx29 * dx29 + dy29 * dy29);

            if (distance <= Math.abs(r129 - r229)) {
                System.out.println("circle2 is inside circle1");
            } else if (distance <= (r129 + r229)) {
                System.out.println("circle2 overlaps circle1");
            } else {
                System.out.println("circle2 does not overlap circle1");
            }
            
    //exercise 30 (current time in 12 hour format)        

            System.out.println("enter time zone offset to gmt:");
            int hour30 = input.nextInt();
            int minute30 = input.nextInt();
            System.out.println(ShowCurrentTime.ShowCurrentTime(hour30, minute30));
            
    //exercise 31 (converting currencies)
    
            System.out.println("enter the exchange rate from dollors to RMB:");
            double exchangeRate = input.nextDouble();
            System.out.println("enter 0 to convert dollors to RMB and 1 for vice versa:");
            int decision31 = input.nextInt();
            if(decision31 == 0){
                System.out.println("enter the dollor amount:");
                double dollors = input.nextDouble();
                double converted = dollors * exchangeRate;
                System.out.println("this much dollors is equal to " + converted + " RBM");
            }
            else if(decision31 == 1){
                System.out.println("enter the amount of RBM:");
                double RBM = input.nextDouble();
                double converted = RBM / exchangeRate;
                System.out.printf("this much RMB is equal to $%.2f\n", converted);
            }
            
    //exercise 32 (point position)
    
            System.out.println("enter the x and y coordinates of point one of the line:");
            double pointonex = input.nextDouble();
            double pointoney = input.nextDouble();
            System.out.println("enter the x and y coordinates of point two of the line:");
            double pointtwox = input.nextDouble();
            double pointtwoy = input.nextDouble();
            System.out.println("enter the x and y coordinates of the point to check its poisiton according to the line:");
            double pointxOf = input.nextDouble();
            double pointyOf = input.nextDouble();
            
            double cheking = ((pointtwox - pointonex)*(pointyOf - pointoney)) - ((pointxOf - pointonex)*(pointtwoy - pointoney));
            if(cheking > 0)
                System.out.println("the point is on the left side of the line");
            else if(cheking == 0)
                System.out.println("the point is on the same line");
            else if(cheking < 0)
                System.out.println("the point is on the right side of the line");
            
    //exercise 33 (compare costs)
    
            System.out.println("enter the weight and price of the first package:");
            double weightRice = input.nextDouble();
            double priceRice =  input.nextDouble();
            System.out.println("enter the weight and price of the second package:");
            double weightRice2 = input.nextDouble();
            double priceRice2 = input.nextDouble();
            
            double pricePerKilo1 = priceRice / weightRice;
            double pricePerKilo2 = priceRice2 / weightRice2;
            
            if(pricePerKilo1 < pricePerKilo2)
                System.out.println("package one is better!");
            else if(pricePerKilo2 < pricePerKilo1)
                System.out.println("package two is better!");
            else if(pricePerKilo1 == pricePerKilo2)
                System.out.println("both packages have the same price");
            
    //exercise 34 (point on line segment)
    
            System.out.println("enter the x and y coordinates of point one of the line:");
            double pointonex34 = input.nextDouble();
            double pointoney34 = input.nextDouble();
            System.out.println("enter the x and y coordinates of point two of the line:");
            double pointtwox34 = input.nextDouble();
            double pointtwoy34 = input.nextDouble();
            System.out.println("enter the x and y coordinates of the point to check its poisiton according to the line:");
            double pointxOf34 = input.nextDouble();
            double pointyOf34 = input.nextDouble();
            
            double cheking34 = ((pointtwox34 - pointonex34)*(pointyOf34 - pointoney34)) - ((pointxOf34 - pointonex34)*(pointtwoy34 - pointoney34));
       
            if(cheking34 == 0){
                if((pointxOf34 >= pointonex34) && (pointxOf34 <= pointtwox34) && (pointyOf34 >= pointoney34) && (pointyOf34 <= pointtwoy34))
                    System.out.println("the point is on the line segment");
                else 
                    System.out.println("the point is not on the line segment");
            }
                
            else
                System.out.println("the point is not on the line segment");
            
            
            
            
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
        
        String time = "";
        
        if (currentHour >= 13 && currentHour <= 24){
            currentHour %= 12;
            time = currentHour + ":" + currentMinute + ":" + currentSecond + " PM";
            
        }
        else if(currentHour < 13){
            time = currentHour + "am:" + currentMinute + ":" + currentSecond + " AM";
            
        }
        return time;
       
    }
    
}
