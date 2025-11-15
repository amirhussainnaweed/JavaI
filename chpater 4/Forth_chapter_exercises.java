
package forth_chapter_exercises;

import java.util.Scanner;

public class Forth_chapter_exercises {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
//exercise 1 (Area of a pentagon)
        
        System.out.println("enter the lenght of the center of the pentagon to a vertex:");
        double lenghtOfVertex = input.nextDouble();
        
        double sidePentagon = 2 * lenghtOfVertex * Math.sin(Math.PI / 5);
        double areaPentagon = (5 * Math.pow(sidePentagon, 2)) / (4 * Math.tan(Math.PI / 5));
        
        System.out.printf("the area of the pentagon is %.2f%n", areaPentagon);
        
//exercise 2 (great circle distance)

        System.out.println("enter the latitude and longitude of the point one in degrees:");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();
        System.out.println("enter the latitude and longitude of the point two in degrees:");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();
        
        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);
        
        double distance2 = (6371.01 * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) + (Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2))));

        System.out.println("the distance between these two points is " + distance2 + " KM");

//exercise 3 (estimate area)

        double atlantaLat = Math.toRadians(33.7489954);
        double atlantaLon = Math.toRadians(-84.3879824);
        double orlandoLat = Math.toRadians(28.5383355);
        double orlandoLon = Math.toRadians(-81.3792365);
        double savannahLat = Math.toRadians(32.0835407);
        double savannahLon = Math.toRadians(-81.0998342);
        double charlotteLat = Math.toRadians(35.2270869);
        double charlotteLon = Math.toRadians(-80.8431267);
        
        double atlantaOrlando = longDistance(atlantaLat, atlantaLon, orlandoLat, orlandoLon);
        double orlandoSavannah = longDistance(orlandoLat, orlandoLon, savannahLat, savannahLon);
        double atlantaSavannah = longDistance(atlantaLat, atlantaLon, savannahLat, savannahLon);
        double atlantaCharlotte = longDistance(atlantaLat, atlantaLon, charlotteLat, charlotteLon);
        double savannahCharlotte = longDistance(savannahLat, savannahLon, charlotteLat, charlotteLon);

        double s1 = (atlantaOrlando + orlandoSavannah + atlantaSavannah) / 2;
        double area1 = Math.sqrt(s1 * (s1 - atlantaOrlando) * (s1 - orlandoSavannah) * (s1 - atlantaSavannah));

        double s2 = (atlantaSavannah + savannahCharlotte + atlantaCharlotte) / 2;
        double area2 = Math.sqrt(s2 * (s2 - atlantaSavannah) * (s2 - savannahCharlotte) * (s2 - atlantaCharlotte));

        double totalArea = area1 + area2;

        System.out.printf("total area enclosed by these four cities(Atlanta, Orlando, Savannah, Charlotte) is:\n%.2f km²%n", totalArea);
        
//exercise 4 (area of a hexagon)

        System.out.println("enter the length of the side of this hexagon to compute its area:");
        double lengthOfSide = input.nextDouble();
        
        double areaOfHexagon = (6 * Math.pow(lengthOfSide, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of this hexagon is %.2f\n", areaOfHexagon);
        
//exercise 5 (area of a regular polygon)

        System.out.print("Enter the number of sides: ");
        int numOfSides = input.nextInt();

        System.out.print("Enter the length of one side: ");
        double sidesOfRegular = input.nextDouble();

        double areaOfRegular = (numOfSides * Math.pow(sidesOfRegular, 2)) / (4 * Math.tan(Math.PI / numOfSides));

        System.out.printf("The area of the polygon is %.4f%n", areaOfRegular);
        
//exercise 6 (random points on a circle)

        double radius6 = 40;

        double a1 = Math.random() * 2 * Math.PI;
        double a2 = Math.random() * 2 * Math.PI;
        double a3 = Math.random() * 2 * Math.PI;

        double x1 = radius6 * Math.cos(a1);
        double y1 = radius6 * Math.sin(a1);

        double x2 = radius6 * Math.cos(a2);
        double y2 = radius6 * Math.sin(a2);

        double x3 = radius6 * Math.cos(a3);
        double y3 = radius6 * Math.sin(a3);

        double side16 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double side26 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)); 
        double side36 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        double angle1 = Math.acos((side26 * side26 + side36 * side36 - side16 * side16) / (2 * side26 * side36));
        double angle2 = Math.acos((side16 * side16 + side36 * side36 - side26 * side26) / (2 * side16 * side36));
        double angle3 = Math.acos((side16 * side16 + side26 * side26 - side36 * side36) / (2 * side16 * side26));
        
        angle1 = Math.toDegrees(angle1);
        angle2 = Math.toDegrees(angle2);
        angle3 = Math.toDegrees(angle3);

        System.out.printf("The three randomly generated angles are %.2f, %.2f, and %.2f\n", angle1, angle2, angle3);
        
//exercise 7 (corner points coordinates)

        System.out.print("Enter the radius of the bounding circle: ");
        double r7 = input.nextDouble();

        int numPoints = 5;

        System.out.println("The coordinates of the five points are:");

        for (int i = 0; i < numPoints; i++) {
            double angle = 2 * Math.PI * i / numPoints; 
            double x = r7 * Math.cos(angle);
            double y = r7 * Math.sin(angle);
            System.out.printf("P%d: (%.2f, %.2f)%n", i + 1, x, y);
        }
        
//exercise 8 (find the character of an ASCII code)

        System.out.println("enter an ASCII code between 0 and 127");
        int ascii8 = input.nextInt();
        char character8 = (char)(ascii8);
        System.out.println("the character is " + character8);
        
//exercise 9 (unicode of a character)

        System.out.println("enter the character to find its unicode:");
        String character9 = input.next();
        char character99 = character9.charAt(0);
        int unicode9 = (int)(character99);
        
        System.out.println("the unicode of this character is " + unicode9);
        
//exercise 10 (guess birthday)

        System.out.println("The program will guess your birthdate by giving you some sets of numbers and asking you if your birthdate is inside the set or not:");
        System.out.println("if your birth date is inside a set enter Y and if not enter N:");
        System.out.println("set one:\n"
                         + "1   3   5    7\n"
                         + "9   11  13  15\n"
                         + "17  19  21  23\n"
                         + "25  27  29  31");
        String set1 = input.next();
        int num1 = 0;
        if (set1.equalsIgnoreCase("Y"))
            num1 = 1;
        
        System.out.println("set two:\n"
                         + "2   3   6   7\n"
                         + "10  11  14  15\n"
                         + "18  19  22  23\n"
                         + "26  27  30  31");
        String set2 = input.next();
        int num2 = 0;
        if (set2.equalsIgnoreCase("y"))
            num2 = 2;
        
        System.out.println("set three:\n"
                         + "4   5   6   7\n"
                         + "12  13  14  15\n"
                         + "20  21  22  23\n"
                         + "28  29  30  31");
        String set3 = input.next();
        int num3 = 0;
        if (set3.equalsIgnoreCase("y"))
            num3 = 4;
        
        System.out.println("set four:\n"
                         + "8   9   10  11\n"
                         + "12  13  14  15\n"
                         + "24  25  26  27\n"
                         + "28  29  30  31");
        String set4 = input.next();
        int num4 = 0;
        if (set4.equalsIgnoreCase("y"))
            num4 = 8;
        
        System.out.println("set five:\n"
                         + "16  17  18  19\n"
                         + "20  21  22  23\n"
                         + "24  25  26  27\n"
                         + "28  29  30  31");
        String set5 = input.next();
        int num5 = 0;
        if (set5.equalsIgnoreCase("y"))
            num5 = 16;
        
        System.out.println("your birthdate is: " + (num1 + num2 + num3 + num4 + num5));
        
//exercise 11 (decimal to hex)

        System.out.print("Enter a decimal value (0 to 15): ");
        int number11 = input.nextInt();

        if (number11 >= 0 && number11 <= 15) {
            if (number11 < 10) 
                System.out.println("The hex value is " + number11);
            else {
                char hexChar11 = (char) ('A' + (number11 - 10));
                System.out.println("The hex value is " + hexChar11);
            }
        } else
            System.out.println("Invalid input");
        
//exercise 12 (Hex to binary)

        System.out.print("Enter a hexadecimal digit: ");
        String hex12 = input.nextLine();
        hex12 = hex12.toUpperCase();

        String bin = "";
        
        char ch12 = hex12.charAt(0);
            

            switch (ch12) {
                case '0': bin = "0000"; break;
                case '1': bin = "0001"; break;
                case '2': bin = "0010"; break;
                case '3': bin = "0011"; break;
                case '4': bin = "0100"; break;
                case '5': bin = "0101"; break;
                case '6': bin = "0110"; break;
                case '7': bin = "0111"; break;
                case '8': bin = "1000"; break;
                case '9': bin = "1001"; break;
                case 'A': bin = "1010"; break;
                case 'B': bin = "1011"; break;
                case 'C': bin = "1100"; break;
                case 'D': bin = "1101"; break;
                case 'E': bin = "1110"; break;
                case 'F': bin = "1111"; break;
                default: System.out.println("invalid hex value");
                return;
                
            }

        System.out.println("The binary value is " + bin);
        
        
//exercise 13 (Vowel or consonant)

        System.out.println("enter a letter:");
        String letter13 = input.next();
        letter13 = letter13.toUpperCase();
        
        char letter_13 = letter13.charAt(0);
        
        if(letter_13 == 'A' || letter_13 == 'E' || letter_13 == 'I' || letter_13 == 'O' || letter_13 == 'U')
            System.out.println("it is a vowel letter");
        else if (letter_13 >= 'A' && letter_13 <= 'Z')
            System.out.println("it is a constonant letter");
        else 
            System.out.println("this is an invalid letter");
        
//exercise 14 (convert letter grade to number)

        System.out.print("Enter a letter grade (A, B, C, D, or F): ");
        String grade_14 = input.next();
        grade_14 = grade_14.toUpperCase();
        char grade14 = grade_14.charAt(0);
        

        int numericValue14;

        switch (grade14) {
            case 'A':
                numericValue14 = 4;
                System.out.println("The numeric value for grade A is " + numericValue14);
                break;

            case 'B':
                numericValue14 = 3;
                System.out.println("The numeric value for grade B is " + numericValue14);
                break;

            case 'C':
                numericValue14 = 2;
                System.out.println("The numeric value for grade C is " + numericValue14);
                break;

            case 'D':
                numericValue14 = 1;
                System.out.println("The numeric value for grade D is " + numericValue14);
                break;

            case 'F':
                numericValue14 = 0;
                System.out.println("The numeric value for grade F is " + numericValue14);
                break;

            default:
                System.out.println("Invalid grade");
        }
        
//exercise 15 (phone keypads)        

        System.out.println("enter a letter:");
        char letter15 = input.next().toUpperCase().charAt(0);
        
        if (letter15 >= 'A' && letter15 <= 'Z'){
            if (letter15 >= 'A' && letter15 <= 'C')
                System.out.println("the corresponding number is 2");
            else if(letter15 >= 'D' && letter15 <= 'F')
                System.out.println("the corresponding number is 3");
            else if(letter15 >= 'G' && letter15 <= 'I')
                System.out.println("the corresponding number is 4");
            else if(letter15 >= 'J' && letter15 <= 'L')
                System.out.println("the corresponding number is 5");
            else if(letter15 >= 'M' && letter15 <= 'O')
                System.out.println("the corresponding number is 6");
            else if(letter15 >= 'P' && letter15 <= 'S')
                System.out.println("the corresponding number is 7");
            else if(letter15 >= 'T' && letter15 <= 'V')
                System.out.println("the corresponding number is 8");
            else if(letter15 >= 'W' && letter15 <= 'Z')
                System.out.println("the corresponding number is 9");
        }
        else 
            System.out.println("an invalid input was entered");
        
//exercise 16 (Random character)

        int randomNum16 = (int) ((Math.random() * 26) + 65);
        char randomCharacter = (char)(randomNum16);
        
        System.out.println("The random character is " + randomCharacter);
        
//exercise 17 (Days of a month)

        System.out.println("enter the year:");
        int year17 = input.nextInt();
        System.out.println("enter the month name (for example: Jan):");
        String monthName17 = input.next();
        
        char check17 = monthName17.charAt(0);
        if(check17 == 'J' || check17 == 'F' || check17 == 'M' || check17 == 'A' || check17 == 'S' || check17 == 'O' || check17 == 'N' || check17 == 'D'){
            if (monthName17.equals("Jan") || monthName17.equals("Mar") || monthName17.equals("May") || monthName17.equals("Jul") || monthName17.equals("Aug") || monthName17.equals("Oct") || monthName17.equals("Dec"))
                System.out.println(monthName17 + " " + year17 + " has 31 days!");
            else if(monthName17.equals("Apr") || monthName17.equals("Jun") || monthName17.equals("Sep") || monthName17.equals("Nov"))
                System.out.println(monthName17 + " " + year17 + " has 30 days!");
            else if(monthName17.equals("Feb")){
                boolean leap = (year17 % 400 == 0 || (year17 % 4 == 0 && year17 % 100 != 0));
                System.out.println(leap? monthName17 + " " + year17 + " has 29 days": monthName17 + " " + year17 + " has 28 days" );
            }
                
            
        }
        else 
            System.out.println(monthName17 + " wasnt written invalid!");
        
//exercise 18 (student major and status)

        System.out.println("enter two chatacters:");
        String twoCharac = input.next();
        twoCharac = twoCharac.toUpperCase();
        char subject = twoCharac.charAt(0);
        char yearof18 = twoCharac.charAt(1);
        
        
        if (subject == 'M'){
            if (yearof18 == '1')
                System.out.println("Mathematics freshman");
            else if(yearof18 == '2')
                System.out.println("Mathematics sophomore");
            else if(yearof18 == '3')
                System.out.println("Mathematics junior");
            else if (yearof18 == '4')
                System.out.println("Mathemtics senior");
        }
        else if (subject == 'C'){
            if (yearof18 == '1')
                System.out.println("Computer Science freshman");
            else if(yearof18 == '2')
                System.out.println("Computer Science sophomore");
            else if(yearof18 == '3')
                System.out.println("Computer Science junior");
            else if (yearof18 == '4')
                System.out.println("Computer Science senior");
        }
        else if (subject == 'I'){
             if (yearof18 == '1')
                System.out.println("Information Technology freshman");
            else if(yearof18 == '2')
                System.out.println("Information Technology sophomore");
            else if(yearof18 == '3')
                System.out.println("Information Technology junior");
            else if (yearof18 == '4')
                System.out.println("Information Technology senior");
        }
        else 
            System.out.println("invalid input");
        
//exercise 19 (ISBN revised with string)

         System.out.println("enter the 9 digit of ISBN:");
         String nineISBN = input.next();
         
         char d1 = nineISBN.charAt(0);
         char d2 = nineISBN.charAt(1);
         char d3 = nineISBN.charAt(2);
         char d4 = nineISBN.charAt(3);
         char d5 = nineISBN.charAt(4);
         char d6 = nineISBN.charAt(5);
         char d7 = nineISBN.charAt(6);
         char d8 = nineISBN.charAt(7);
         char d9 = nineISBN.charAt(8);
         
         int d1_ = d1 - '0';
         int d2_ = d2 - '0';
         int d3_ = d3 - '0';
         int d4_ = d4 - '0';
         int d5_ = d5 - '0';
         int d6_ = d6 - '0';
         int d7_ = d7 - '0';
         int d8_ = d8 - '0';
         int d9_ = d9 - '0';

            
         int tenISBN = ((d1_ * 1) + (d2_ * 2) + (d3_ * 3) + (d4_ * 4) + (d5_ * 5) + (d6_ * 6) + (d7_ * 7) + (d8_ * 8) + (d9_ * 9)) % 11;
            
         if (tenISBN == 10)
            System.out.println(nineISBN + "X");
         else if (tenISBN < 10)
            System.out.println(nineISBN + "" + tenISBN);
        
//exercise 20 (process a string)

        System.out.println("enter a string:");
        String namestring = input.next();
        
        int lenghtString = namestring.length();
        char firstchar20 = namestring.charAt(0);
        
        System.out.println("the length is " + lenghtString + " and the first character is " + firstchar20);
        
//exercise 21 (check ssn)    

       System.out.println("Enter a social security number (format DDD-DD-DDDD):");
        String ssnNumber = input.next();

        boolean isValid = true;

        if (ssnNumber.length() != 11) 
            isValid = false;
          else {
            for (int i = 0; i < ssnNumber.length(); i++) {
                char ch = ssnNumber.charAt(i);

                if (i == 3 || i == 6) {
                    if (ch != '-') {
                        isValid = false;
                        break;
                    }
                } else {
                    if (!Character.isDigit(ch)) {
                        isValid = false;
                        break;
                    }
                }
            }
        }

        if (isValid)
            System.out.println(ssnNumber + " is a valid social security number!");
        else
            System.out.println(ssnNumber + " is not a valid social security number!");
        
//exercise 22 (check substring) 

        System.out.println("enter the first String:");
        String one22 = input.next();
        System.out.println("enter the second String:");
        String second22 = input.next();
        
        if (one22.indexOf(second22) != -1)
            System.out.println("the second string is a substring of first string");
        else
            System.out.println("the second string is not a substring of the first string");
        
//exercise 23 (payroll)

        System.out.print("Enter employee's name: ");
        String name23 = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hours23 = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate23 = input.nextDouble();

        System.out.print("Enter federal tax withholding rate (e.g., 0.20 for 20%): ");
        double federalTaxRate23 = input.nextDouble();

        System.out.print("Enter state tax withholding rate (e.g., 0.09 for 9%): ");
        double stateTaxRate23 = input.nextDouble();

        double grossPay = hours23 * payRate23;
        double federalWithholding = grossPay * federalTaxRate23;
        double stateWithholding = grossPay * stateTaxRate23;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("\nEmployee Name: " + name23);
        System.out.println("Hours Worked: " + hours23);
        System.out.println("Pay Rate: $" + payRate23);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%): $%.2f\n", federalTaxRate23 * 100, federalWithholding);
        System.out.printf("  State Withholding (%.1f%%): $%.2f\n", stateTaxRate23 * 100, stateWithholding);
        System.out.printf("  Total Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f\n", netPay);
        
//exercise 24 (order three cities)

        System.out.println("enter the first city name:");
        String city1Name = input.next();
        System.out.println("enter the second city name:");
        String city2Name = input.next();
        System.out.println("enter the third city name:");
        String city3Name = input.next();
        
        
        char cityOne24 = city1Name.charAt(0);
        char cityTwo24 = city2Name.charAt(0);
        char cityThree24 = city3Name.charAt(0);
        
        if (cityOne24 < cityTwo24 && cityOne24 < cityThree24){
            if(cityTwo24 < cityThree24)
                System.out.println("the aphabetic order is " + city1Name + " " + city2Name + " " + city3Name);
            else if(cityThree24 < cityTwo24)
                System.out.println("the order is " + city1Name + " " + city3Name + " " + city2Name);
        }
        
        else if (cityTwo24 < cityOne24 && cityTwo24 < cityThree24){
            if(cityOne24 < cityThree24)
                System.out.println("the order is " + city2Name + " " + city1Name + " " + city3Name);
            else if(cityThree24 < cityOne24)
                System.out.println("the order is " + city2Name + " " + city3Name + " " + city1Name);
        }
        
        else if (cityThree24 < cityOne24 && cityThree24 < cityTwo24){
            if(cityOne24 < cityTwo24)
                System.out.println("the order is " + city3Name + " " + city1Name + " " + city2Name);
            else if(cityTwo24 < cityOne24)
                System.out.println("the order is " + city3Name + " " + city2Name + " " + city1Name);
        }
        
        
//exercise 25 (generate vehicle plate number)

        int characterone = (int) ((Math.random() * 26) + 65);
        char randomCharacter1 = (char)(characterone);
        
        int charactertwo = (int) ((Math.random() * 26) + 65);
        char randomCharacter2 = (char)(charactertwo);
        
        int characterthree = (int)((Math.random() * 26) + 65);
        char randomCharacter3 = (char)(characterthree);
        
        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);
        int digit4 = (int)(Math.random() * 10);
        
        System.out.println("the plate generated is: ");
        System.out.println(randomCharacter1 + "" + randomCharacter2 + "" + randomCharacter3 + "" + digit1 + "" + digit2 + "" + digit3 + "" + digit4);
        
//exercise 26 (monetary units)

        System.out.println("enter the amount of your money (like : 11.56)");
        String money26 = input.next();
        
        int k = money26.indexOf('.');
        System.out.println("the amount of dollors is " + money26.substring(0, k) + " and the amount of the cents is " + money26.substring(k + 1));
        
        
    }
    
    public static double longDistance(double lat1, double lon1, double lat2, double lon2){
        return 6371.01 * Math.acos(Math.sin(lat1) * Math.sin(lat2)+ Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

    }
    
}
