
package fifth_chapter_exercises;

import java.util.Scanner;

public class Fifth_chapter_exercises {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
//exercise 1 (count positive and negative numbers)

        int positivecounter = 0;
        int negeativecounter = 0;
        int total = 0;
        int userinput = -1;
        
        System.out.println("enter an integer and 0 to end:");
        
        while(userinput != 0){
            userinput = input.nextInt();
            if(userinput < 0){
                negeativecounter++;
                total += userinput;
            }
            else if(userinput > 0){
                positivecounter++;
                total += userinput;
            }
        }
        
        double average1 = (double)(total) / (double)(positivecounter + negeativecounter);
        System.out.println("the total number of positives is " + positivecounter);
        System.out.println("the total number of negatives is " + negeativecounter);
        System.out.println("the sum is " + total);
        System.out.println("the average is " + average1);
        
        
//exercise 2 (addition quiz)

        System.out.println("this program will ask you 10 addition questions:");
        
        
        int count2 = 0;
        for(int i = 0; i < 10; i++){
            final long timeStart = System.currentTimeMillis() / 1000;
            int num1 = (int)((Math.random() * 15) + 1);
            int num2 = (int)((Math.random() * 15) + 1);
            
            int result2 = num1 + num2;
            
            System.out.println("what is the " + num1 + " + " + num2 + "?");
            int userresult2 = input.nextInt();
            if (result2 == userresult2){
                count2++;
            }
            
            final long timeEnd;
            if(i == 9){
                timeEnd = System.currentTimeMillis() / 1000;
                System.out.println("the total time of the test is " + (timeEnd - timeStart) + " seconds");
            }    
        }
        
        System.out.println("the total number of correct answers is " + count2);
        
//exercise 3 (conversion from kilograms to pound)

        System.out.println("Kilograms\tPounds\n");
        for (int i = 0; i <= 99; i++){
            int kilogram3 = (2 * i) + 1;
            float pounds3 = kilogram3 * 2.2F;
            System.out.printf(kilogram3 + "\t\t%.1f%n", pounds3);
        }
        
       
//exercise 4 (conversion from miles to kilometers)

        System.out.println("Miles\tKilometers");
        for(int i = 1; i <= 10; i++){
            int miles4 = i;
            float kilometers4 = 1.609f * i;
            System.out.printf(i + "\t%.3f%n", kilometers4);
        }
        
        
//exercise 5 (conversion from kilograms to pound and vice versa)

        System.out.println("Kilograms\tPounds   |   Pounds\tKilograms\n");
        for(int i = 0; i <= 99; i++){
            int Kilograms5 = (2 * i) + 1;
            float pounds5 = Kilograms5 * 2.2f;
            
            int pounds55 = 20 + (5 * i);
            float kilograms55 = pounds55 / 2.2f;
            System.out.printf("%-16d%-9.1f|   %-11d%-10.2f%n", Kilograms5, pounds5, pounds55, kilograms55);
        }
        
    
//exercise 6 (conversion from miles to kilometers)

        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles\n");
        for(int i = 1; i <= 10; i++){
            int miles6 = i;
            float kilometers6 = 1.609f * i;
            
            int kilometers66 = 15 + (5 * i);
            float miles66 = kilometers66 / 1.609f;
            
            System.out.printf("%d\t%.3f\t\t|\t%d\t\t%.3f%n", miles6, kilometers6, kilometers66, miles66);
        }
        
//exercise 7 (future tuition)
        
        double tuitonperyear = 10000;
        double percentageperyear = 0.05;
        double sum = 0;
        
        for(int i = 0; i < 10; i++){
            tuitonperyear = tuitonperyear * (1.05);
            sum += tuitonperyear;
            final double tuitionoffouryear;
            if (i == 3){
                tuitionoffouryear = sum;
                System.out.println("tuition in four years of study will be: " + sum);
            }
        }
        
        System.out.println("tuition in ten years will be: " + sum);
        
//exercise 8 (find the highest score)

        System.out.println("enter the number of students:");
        int stuentsnum = input.nextInt();
        String studentname = "";
        String laststudentName = "";
        
        double score8 = 0;
        double laststudentscore = 0;
        
        for(int i = 0; i < stuentsnum; i++){
            System.out.println("enter the " + (i+1) + " students name:");
            studentname = input.next();
            System.out.println("enter the " + (i+1) + " students score:");
            score8 = input.nextDouble();
            if(score8 > laststudentscore){
                laststudentscore = score8;
                laststudentName = studentname;
            }
        }
        
        System.out.println("the student with highest mark is " + laststudentName + " with " + laststudentscore + " marks");
        
//exercise 9 (two top numbers)

        System.out.print("Enter the number of students: ");
        int numberOfStudents9 = input.nextInt();

        String topStudent9 = "";
        String secondStudent9 = "";
        double topScore9 = -1;
        double secondScore9 = -1;

        for (int i = 0; i < numberOfStudents9; i++) {
            System.out.print("Enter a student name: ");
            String name9 = input.next(); 

            System.out.print("Enter the student's score: ");
            double score9 = input.nextDouble();

            if (score9 > topScore9) {
                secondScore9 = topScore9;
                secondStudent9 = topStudent9;

                topScore9 = score9;
                topStudent9 = name9;
            } else if (score9 > secondScore9) {
                secondScore9 = score9;
                secondStudent9 = name9;
            }
        }

        System.out.println("\nHighest score: " + topStudent9 + " (" + topScore9 + ")");
        System.out.println("Second highest score: " + secondStudent9 + " (" + secondScore9 + ")");
        
//exercise 10 (find numbers divisible by 5 and 6) 
        
        int count10 = 0;
        for (int i = 100; i <= 1000; i++){
            if(i % 5 == 0 && i % 6 == 0){
                System.out.print(i + " ");
                count10++;
                if(count10 == 10){
                    System.out.println();
                    count10 = 0;
                }
            }
        }
        
//exercise 11 (numbers divisible on 5 and 6 but not both)

        int count11 = 0;
        for(int i = 100; i <= 1000; i++){
            if(i % 5 == 0 ^ i % 6 == 0){
                System.out.print(i + " ");
                count11++;
                if(count11 == 10){
                    System.out.println();
                    count11 = 0;
                }
            }
        }
        
//exercise 12 (finding the smallest n)

        int n12 = 1;
        while (n12 * n12 < 12000){
            n12++;
        }
        System.out.println(n12);
        
        
//exercise 13 (finding the largest n)

        int n13 = 1;
        while (Math.pow(n13, 3) < 12000){
            n13++;
        }
        System.out.println(n13 -1);
        
   
//exercise 14 (finding the gcd)

        System.out.println("Enter first integer: ");
        int n114 = input.nextInt();
        System.out.println("Enter second integer: ");
        int n214 = input.nextInt();
        
        int d = 0;
        if(n114 < n214)
            d = n114;
        else
            d = n214;
        
        int gcd14 = 1; 

        for (int i = d; i >= 1; i--) {
            if (n114 % i == 0 && n214 % i == 0) {
                gcd14 = i;   
                break;     
            }
        }

        System.out.println("The greatest common divisor for " + n114 + " and " + n214 + " is " + gcd14);
        
        
//exercise 15 (dispaly the ASCII character table)

        int count15 = 0; 

        for (int i = 33; i <= 126; i++) {
            System.out.print((char)i + " ");
            count15++;

            if (count15 == 10) {
                System.out.println();
                count15 = 0;
            }
        }
        
        
//exercise 16 (finding the factors of an integer)

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        int factor = 2; 

        System.out.println("The factors are: ");

        while (number > 1) {
            if (number % factor == 0) {
                System.out.print(factor + " ");
                number /= factor;
            }else 
                factor++; 
        }
        
        
//exercise 17 (printing pyrimad)

        System.out.print("Enter the number of lines (1-15): ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  "); 
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        
//exercise 18 (displaying four dypes of patterns)  

        //first patter:
        int n1 = 6;
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //second pattern:
        int n2 = 6;
        for (int i = n2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println();
   
        //third pattern:
        int n3 = 6;
        for (int i = 1; i <= n3; i++) {
            for (int j = n3 - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //forth pattern:
        int n4 = 6;
        for (int i = 0; i < n4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n4 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        
//exercise 19 (display numbers in a pyrimad pattern:)

        int n19 = 8; // number of rows (last row contains 128)

        for (int i = 1; i <= n19; i++) {
            for (int s = n19 - i; s > 0; s--) {
                System.out.print("    "); // 4 spaces for alignment
            }

            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }

            for (int j = i - 2; j >= 0; j--) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }

            System.out.println();
        }
        
        
//exercise 20 (display prime numbers between 2 and 1000)

        int count = 0; 

        for (int number20 = 2; number20 <= 1000; number20++) {
            if (isPrime(number20)) {
                count++;
                if (count % 8 == 0)
                    System.out.println(number20); 
                else
                    System.out.print(number20 + " ");
            }
        }
        
//exercise 21 (comparing loan amount)

        System.out.println("Enter loan amount: ");
        double loan = input.nextDouble();

        System.out.println("Enter number of years: ");
        int years = input.nextInt();

        System.out.println("Interest Rate    Monthly Payment    Total Payment\n");
        for (double annualRate = 5.0; annualRate <= 8.0; annualRate += 0.125) {

            double monthlyRate = annualRate / 1200.0;
            double monthlyPayment = (loan * monthlyRate) / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;

            System.out.printf("%-5.3f%%         %10.2f          %11.2f\n", annualRate, monthlyPayment, totalPayment);
        }
        
        
//exercise 22 (loan amortization schedule)

        System.out.println("Loan Amount: ");
        double loanAmount22 = input.nextDouble();

        System.out.println("Number of Years: ");
        int years22 = input.nextInt();

        System.out.println("Annual Interest Rate (e.g., 7.25): ");
        double annualRate22 = input.nextDouble();

        double monthlyRate22 = annualRate22 / 1200;
        double monthlyPayment22 = (loanAmount22 * monthlyRate22) /
                (1 - 1 / Math.pow(1 + monthlyRate22, years22 * 12));
        double totalPayment22 = monthlyPayment22 * years22 * 12;

        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment22);
        System.out.printf("Total Payment: %.2f\n\n", totalPayment22);

        System.out.println("Payment#     Interest     Principal     Balance");
        System.out.println("-----------------------------------------------");

        double balance22 = loanAmount22;
        for (int i = 1; i <= years22 * 12; i++) {
            double interest = monthlyRate22 * balance22;
            double principal = monthlyPayment22 - interest;
            balance22 -= principal;
            if (balance22 < 0) balance22 = 0; 

            System.out.printf("%-10d%8.2f%14.2f%15.2f\n",
                    i, interest, principal, balance22);
        }
        
        
//exercise 23 (Demonstrate cancellation errors)

       
        int n23 = 50000;          
        double sum1 = 0.0;

        for (int i = 1; i <= n23; i++) {
            sum1 += 1.0 / i;
        }
        System.out.println("Sum from left to right with less accuracy is: " + sum1);

        double sum2 = 0.0;
        for (int i = n23; i >= 1; i--) {
            sum2 += 1.0 / i;
        }
        System.out.println("Sum from right to left with more accuracy is: " + sum2);
        
        
//exercise 24 (Summing a series)

        double sum24 = 0.0;
        
        for (int i = 1; i <= 49; i++){
            double top24 = (2 * i) - 1;
            double down24 = (2 * i) + 1;
            
            double result24 = top24 / down24;
            sum24 += result24;
            
        }
        System.out.println("the sum is " + sum24);
        
        
//exercise 25 (Compute PI)

        double pi_value = 0.0;
        
        for(double i = 1.0; i <= 100000.0; i++){
            double topof25 = Math.pow(-1.0, (i + 1.0));
            double downof25 = (2.0 * i) - 1.0;
            double result25 = topof25 / downof25;
            pi_value += result25;
        }
        System.out.println("the pi value is " + (4 * pi_value));
        
        
//exercise 26 (Compute e)   

        double e = 1.0;
        for(int i = 1; i <= 20; i++){
            double item = 1.0 / factorial(i);
            e += item;
        }
        System.out.println("the e value is " + e);
        
//exercise 27 (display leap years)

        int count27 = 0;
        
        System.out.println("These are the leap years from 101 to 2100\n");
        for(int i = 101; i <= 2100; i++){
            if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)){
                System.out.print(i + " ");
                count27++;
                if(count27 == 10){
                    System.out.println();
                    count27 = 0;
                }
            }
        }
        
        
//exercise 28 (display the first day of each month)   

        System.out.println("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = input.nextInt();

        for (int month = 1; month <= 12; month++) {
            String monthName = "";
            int daysInMonth = 0;

            switch (month) {
                case 1:
                    monthName = "January";
                    daysInMonth = 31;
                    break;
                case 2:
                    monthName = "February";
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                        daysInMonth = 29;
                    else
                        daysInMonth = 28;
                    break;
                case 3:
                    monthName = "March";
                    daysInMonth = 31;
                    break;
                case 4:
                    monthName = "April";
                    daysInMonth = 30;
                    break;
                case 5:
                    monthName = "May";
                    daysInMonth = 31;
                    break;
                case 6:
                    monthName = "June";
                    daysInMonth = 30;
                    break;
                case 7:
                    monthName = "July";
                    daysInMonth = 31;
                    break;
                case 8:
                    monthName = "August";
                    daysInMonth = 31;
                    break;
                case 9:
                    monthName = "September";
                    daysInMonth = 30;
                    break;
                case 10:
                    monthName = "October";
                    daysInMonth = 31;
                    break;
                case 11:
                    monthName = "November";
                    daysInMonth = 30;
                    break;
                case 12:
                    monthName = "December";
                    daysInMonth = 31;
                    break;
            }

            String dayName = "";
            switch (firstDay) {
                case 0: dayName = "Sunday"; break;
                case 1: dayName = "Monday"; break;
                case 2: dayName = "Tuesday"; break;
                case 3: dayName = "Wednesday"; break;
                case 4: dayName = "Thursday"; break;
                case 5: dayName = "Friday"; break;
                case 6: dayName = "Saturday"; break;
            }

            System.out.println(monthName + " 1, " + year + " is " + dayName);

            firstDay = (firstDay + daysInMonth) % 7;
        }
        
        
//exercise 29 (Display calender)

        System.out.println("Enter year: ");
        int year29 = input.nextInt();

        System.out.println("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay29 = input.nextInt();
        
        for (int month = 1; month <= 12; month++) {
            int countdays = 0;
            String monthName = "";
            int daysInMonth = 0;

            switch (month) {
                case 1:
                    monthName = "January";
                    daysInMonth = 31;
                    break;
                case 2:
                    monthName = "February";
                    if ((year29 % 400 == 0) || (year29 % 4 == 0 && year29 % 100 != 0))
                        daysInMonth = 29;
                    else
                        daysInMonth = 28;
                    break;
                case 3:
                    monthName = "March";
                    daysInMonth = 31;
                    break;
                case 4:
                    monthName = "April";
                    daysInMonth = 30;
                    break;
                case 5:
                    monthName = "May";
                    daysInMonth = 31;
                    break;
                case 6:
                    monthName = "June";
                    daysInMonth = 30;
                    break;
                case 7:
                    monthName = "July";
                    daysInMonth = 31;
                    break;
                case 8:
                    monthName = "August";
                    daysInMonth = 31;
                    break;
                case 9:
                    monthName = "September";
                    daysInMonth = 30;
                    break;
                case 10:
                    monthName = "October";
                    daysInMonth = 31;
                    break;
                case 11:
                    monthName = "November";
                    daysInMonth = 30;
                    break;
                case 12:
                    monthName = "December";
                    daysInMonth = 31;
                    break;
            }

            String dayName = "";
            switch (firstDay29) {
                case 0: dayName = "Sunday"; break;
                case 1: dayName = "Monday"; break;
                case 2: dayName = "Tuesday"; break;
                case 3: dayName = "Wednesday"; break;
                case 4: dayName = "Thursday"; break;
                case 5: dayName = "Friday"; break;
                case 6: dayName = "Saturday"; break;
            }

            System.out.println("\t" + monthName + " " + year29 + "\t");
            System.out.println("  Sun Mon Tue Web Thu Fri Sat");
            System.out.println("  ---------------------------");
            for(int i = 1; i <= firstDay29; i++){
                System.out.print("    ");
                countdays++;
            }
            for(int i = 1; i <= daysInMonth; i++){
                System.out.printf("%4d", i);
                countdays++;
                if(countdays == 7){
                    System.out.println();
                    countdays = 0;
                }
                if(i == daysInMonth)
                    System.out.println("\n" + "  ____________________________" + "\n");
            }

            firstDay29 = (firstDay29 + daysInMonth) % 7;
        }
        
        
//exercise 30 (financial application: compound value)

        System.out.println("enter the amount saving per month");
        double saving = input.nextDouble();
        final double saving30 = saving;
        System.out.println("enter the amount of annual interest rate:");
        double interest_rate = input.nextDouble();
        System.out.println("enter after how many months you want to see your balance:");
        int howManyMonths = input.nextInt();
        
        double monthlyInterest = interest_rate / 1200.0;
        double totalamount = 0.0;
        for(int i = 1; i <= howManyMonths; i++){
            totalamount = ((totalamount + saving30) * (1 + monthlyInterest)); 
        }
        System.out.printf("after this much time the account balance is: %.3f%n", totalamount);
        
        
//exercise 31 (CD Value)

        System.out.println("enter the initial deposit amount:");
        double totalDeposit = input.nextDouble();
        System.out.println("enter annual percentage yield:");
        double percentageYield = input.nextDouble();
        System.out.println("enter maturity period (number of months:)");
        int numberOfMonths = input.nextInt();
        
        System.out.println();
        
        System.out.println("Month\tCD Value");
        System.out.println("------+----------");
        
        double totalCDvalue = 0.0;
        double monthlyRate31 = percentageYield / 1200.0;
        for(int i = 1; i <= numberOfMonths; i++){
            totalDeposit = (totalDeposit) * (1 + monthlyRate31);
            System.out.printf("%3d\t%.2f%n", i, totalDeposit);
        }
        
//exercise 32 (revising the lottery problem)

        int firstdigit32 = (int)(Math.random() * 10);
        int seconddigit32 = firstdigit32;
        
        while (firstdigit32 == seconddigit32){
            seconddigit32 = (int)(Math.random() * 10);
        }
                
        System.out.println("can you guess the two digit number to win the lottery:");
        int userguess32 = input.nextInt();
        
        int firstdigituser = userguess32 / 10;
        int seconddigituser = userguess32 % 10;
        
        if(firstdigit32 == firstdigituser && seconddigit32 == seconddigituser)
            System.out.println("congrats you won $10000");
        else if(firstdigit32 == seconddigituser && seconddigit32 == firstdigituser)
            System.out.println("congrats, the order was not right but you won $3000");
        else if((firstdigit32 == firstdigituser || seconddigit32 == seconddigituser) || (firstdigit32 == seconddigituser || seconddigit32 == firstdigituser))
            System.out.println("one digit was correct you won $1000");
        else 
            System.out.println("unfortunely your guess was not correct!");
        
//exercise 33 (Perfect number)

        for(int i = 1; i < 10000; i++){
            int total33 = 0;
            for(int j = 1; j <= (i / 2); j++){
                if(i % j == 0)
                    total33 += j;
            }
            if(total33 == i)
                System.out.print(i + " ");
        }
        
//exercise 34 (Game: Rock, Paper and scissors)        
        
        
        int compcounter34 = 0;
        int usercounter34 = 0;
        
        while(compcounter34 != 2 && usercounter34 != 2){
            
            int compchoice = (int)(Math.random() * 3);
            System.out.println("choose scissors (0) rock (1) and paper (2)");
            int userchoice = input.nextInt();
            
            if(compchoice == 0){
                if(userchoice == 0)
                    System.out.println("computer is also scissors. It is a draw");
                else if(userchoice == 1){
                    System.out.println("computer was scissors, you are rock, you won");
                    usercounter34++;
                }
                else if(userchoice == 2){
                    System.out.println("computer was scissors, you are paper, computer won");
                    compcounter34++;
                }
            }
            else if(compchoice == 1){
                if(userchoice == 0){
                    System.out.println("computer was rock, you are scissors, so computer won");
                    compcounter34++;
                }
                else if(userchoice == 1)
                    System.out.println("computer was rock, you are also rock, it is a draw");
                else if(userchoice == 2){
                    System.out.println("computer was rock, you are paper, so you won");
                    usercounter34++;
                }
            }
            else if(compchoice == 2){
                if(userchoice == 0){
                    System.out.println("computer was paper, you are scissors, so you won");
                    usercounter34++;
                }
                else if(userchoice == 1){
                    System.out.println("computer was paper, you are rock, so computer won");
                    compcounter34++;
                }
                else if(userchoice == 2)
                    System.out.println("computer was paper, you are also paper, so it is a draw");
            }
        }
        System.out.println("you won " + usercounter34 + " time(s) and computer won " + compcounter34 + " time(s)");
        
        
//exercise 35 (Computing summation)


        double total35 = 0.0;
        for(int i = 1; i <= 624; i++){
            total35 += (1) / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.println("the sum is " + Math.round(total35));
        
        
//exercise 36 (Business application: checking ISBN)

        System.out.println("enter the 9 digit of ISBN:");
        String nineISBN = input.next();
        
        int tenISBN = 0;
        for(int i = 0; i < nineISBN.length(); i++){
            char digits36 = nineISBN.charAt(i);
            int intvaluedigit36 = digits36 - '0';
            tenISBN += intvaluedigit36 * (i + 1); 
        }
        
        tenISBN %= 11;
        
        if (tenISBN == 10)
           System.out.println(nineISBN + "X");
        else if (tenISBN < 10)
           System.out.println(nineISBN + "" + tenISBN);
        
//exercise 37 (Decimal to binary)

        System.out.println("enter a decimal vlaue to find its binary value:");
        int decimalValue = input.nextInt();
        
        String binValuein37 = "";
        while (decimalValue > 0){
            int bindigit = decimalValue % 2;
            decimalValue /= 2;
            binValuein37 = bindigit + binValuein37;
        }
        System.out.println(binValuein37);
        
//exercise 38 (Decimal to Octal)

        System.out.println("enter a decimal value to find its octal value:");
        int decimalValue38 = input.nextInt();
        
        String octValue = "";
        while (decimalValue38 > 0){
            int octdigit = decimalValue38 % 8;
            decimalValue38 /= 8;
            octValue = octdigit + octValue;
        }
        System.out.println(octValue);
        
        
//exercise 39 (Find the sales amount)

        double neededCommission = 25000.0;

        double salesAmount = 0.0;
        double commission = 0.0;

        while (commission < neededCommission) {
            salesAmount += 0.01;
            commission = computeCommission(salesAmount);
        }

        System.out.printf("Minimum sales needed: $%.2f\n", salesAmount);
        System.out.printf("Commission earned: $%.2f\n", commission);
        System.out.printf("Total income: $%.2f\n", 5000 + commission);
    
        
        

//exercise 40 (Heads or tails)

        int headCounter = 0;
        int tailCounter = 0;
        for(int i = 1; i <= 1000000; i++){
            int flipCoin = (int)(Math.random() * 2);
            if(flipCoin == 1)
                headCounter++;
            else if(flipCoin == 0)
                tailCounter++;
        }
        System.out.println("number of heads is " + headCounter + " and number of tails is " + tailCounter);

        
//exercise 41 (Occurance of max number)

        System.out.println("enter the integers to find the occurance of the max integer and 0 to quit:");
        int number41 = 1;
        int max41 = number41;
        int countmax = 0;
        
        while(number41 != 0){
            System.out.println("enter the numbers:");
            number41 = input.nextInt();
            if(number41 > max41){
                max41 = number41;
                countmax = 1;
            }
            else if(number41 == max41){
                countmax++;
            }
        }
        System.out.println("the largerst number is " + max41);
        System.out.println("the number of times this number was repeated is " + countmax);
        
        
//exercise 42 (Finding the sales amount commision asked from user:)

        System.out.println("enter the commission sought:");
        double commission_sought = input.nextDouble();
        
        double salesAmount42 = 0.0;
        double commission42 = 0.0;

        int i = 1;
        for(i = 1; commission42 <= commission_sought; i++) {
            salesAmount42 += 0.01;
            commission42 = computeCommission(salesAmount42);
        }

        System.out.printf("Minimum sales needed: $%.2f\n", salesAmount42);
        System.out.printf("Commission earned: $%.2f\n", commission42);
        System.out.println(i);
        

//exercise 43 (combinations)
    
        int counterofnumbers = 0;
        for(int i1 = 1; i1 <= 7; i1++){
            for(int j = 1; j <= 7; j++){
                System.out.println(i1 + "" + j);
                if(i1 == j && i1 != 1)
                    System.out.println();
                counterofnumbers++;
                
            }
                
        }
        System.out.println("The total number of the combinations is " + counterofnumbers);
        
        
//exercise 44 (Computer architecture: bit level operators) 

        System.out.println("Enter a short integer: ");
        short value44 = input.nextShort();

        String result44 = "";

        for (int i2 = 15; i2 >= 0; i2--) {
            int bit = (value44 >> i2) & 1;
            result44 += bit;
        }

        System.out.println("The 16 bits are " + result44);
        
        
//exercise 45 (Compute mean and standard deviation)

        System.out.println("enter ten number to find the mean and the standard deviation:");
        
        double sum45 = 0;
        double numbers45 = 0;
        double sumsquares = 0;

        for(int i3 = 1; i3 <= 10; i3++){
            System.out.println("enter the numbers:");
            numbers45 = input.nextDouble();
            sum45 += numbers45;
            sumsquares += (Math.pow(numbers45, 2.0));

        }
        double mean45 = sum45 / 10.0;
        double deviation45 = Math.sqrt((sumsquares - (Math.pow(sum45, 2) / 10d)) / (10.0 - 1));
        
        System.out.println("The mean is " + mean45);
        System.out.printf("The deviation is %.5f%n", deviation45);
        

//exercise 46 (reverse string)

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        String reversed = "";

        for (int i4 = str.length() - 1; i4 >= 0; i4--) {
            reversed += str.charAt(i4);  
        }

        System.out.println("Reversed string: " + reversed);
        
//exercise 47 (cheching the first 12 digits of an ISBN thirteen)

        System.out.println("enter the first 12 digit of the ISBN thirteen:");
        String ISBN_thirteen = input.next();
        
        int sum47 = 0;
        for(int i5 = 0; i5 <= 11; i5++){
            char digits = ISBN_thirteen.charAt(i5);
            
            if(!Character.isDigit(digits) || ISBN_thirteen.length() != 12){
                System.out.println("is an invalid input");
                return;
            }
            int digit47 = digits - '0';
            if(i5 % 2 == 0)
                sum47 += digit47;
            else if(i5 % 2 != 2)
                sum47 += (3 * digit47);
        }
        
        int lastdigit = 10 - (sum47 % 10);
        if(lastdigit == 10){
            lastdigit = 0;
            System.out.println("the isbn is " + ISBN_thirteen + "" + lastdigit);
        }
        else
            System.out.println("the isbn is " + ISBN_thirteen + "" + lastdigit);
        
//exercise 48 (String processing)

        System.out.println("enter a string:");
        String str48 = input.nextLine();
        
        for(int i6 = 0; i6 < str48.length(); i6++){
            char character = str48.charAt(i6);
            if(i6 % 2 == 0)
                System.out.print(character + "");
            if(i6 == str48.length() - 1)
                System.out.println();
        }
        
//exercise 49 (Count vowels and consonents)

        System.out.println("enter a string:");
        String str49 = input.nextLine();
        str49 = str49.toUpperCase();
        
        int vowelCounter = 0;
        int consonentCounter = 0;
        for(int i7 = 0; i7 < str49.length(); i7++){
            char character49 = str49.charAt(i7);
            if(character49 == 'A' || character49 == 'E' || character49 == 'I' || character49 == 'O' || character49 == 'U')
                vowelCounter++;
            else if(character49 >= 'A' && character49 <= 'Z')
                consonentCounter++;
        }
        
        System.out.println("the number of vowels are " + vowelCounter);
        System.out.println("the number of consonents are " + consonentCounter);
        
//exercise 50 (Count uppercase letters)

        System.out.println("enter a string:");
        String str50 = input.nextLine();
        
        int uppercaseCounter = 0;
        for (int i8 = 0; i8 < str50.length(); i8++){
            char character50 = str50.charAt(i8);
            if(character50 >= 'A' && character50 <= 'Z')
                uppercaseCounter++;
        }
        System.out.println("the number of uppercases are " + uppercaseCounter);
        
//exercise 51 (checking the longest prefix)

        System.out.println("enter the first String:");
        String strone = input.nextLine();
        System.out.println("enter the second String:");
        String strtwo = input.nextLine();
        
        int max51 = strone.length();
        if(strtwo.length() > strone.length())
            max51 = strtwo.length();
        
        String longest_prefix = "";
        for(int i9 = 0; i9 < max51; i9++){
            char character1 = strone.charAt(i9);
            char character2 = strtwo.charAt(i9);
            
            if(character1 != character2)
                break;
            
            longest_prefix += character1;
        }
        System.out.println("the longest prefix is " + longest_prefix);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int divisor = 2; divisor <= Math.sqrt(n); divisor++) {
            if (n % divisor == 0)
                return false;
        }
        return true;
    }
    
    public static int factorial(int i){
        int result = i;
        for(int n = 1; n < i; n++){
            result *= (i - n);
        }
        return result;
    }

    public static double computeCommission(double sales){
        double commission = 0;

        if (sales > 10000) {
            commission += (sales - 10000) * 0.12;
            sales = 10000;
        }

        if (sales > 5000) {
            commission += (sales - 5000) * 0.10;
            sales = 5000;
        }

        if (sales > 0) {
            commission += sales * 0.08;
        }

        return commission;
    }
}
