//Name: Amir Hussain Naweed 
//Instructor: Ahmad Roheed Khaliqyar
//Class: IS Department first semester
//Date: September 26, 2025
//This program computes taxes based on American rules. These are two ways: (1) using if and else statement and (2) using swtich statement


package computing_tax;

import java.util.Scanner;

public class Computing_tax {

  
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
        
        System.out.println("Choose one number for your marital status:"
                         + "\nSingle = 0"
                         + "\nMarried filing jointly = 1"
                         + "\nMarried filing saperately = 2"
                         + "\nHead of household = 3 ");
        int status = input.nextInt();
        System.out.println("Enter your salary: ");
        int salary = input.nextInt();
        double tax = 0;
        
        
        
        //Counting tax using if and else statements:
        
        
        
        if (status == 0) {
            if (salary >= 0 && salary <= 8350) {
                tax = salary * 0.10;
            }
            else if (salary >= 8351 && salary <= 33950) {
                tax = salary * 0.15;
            }
            else if (salary >= 33951 && salary <= 82250) {
                tax = salary * 0.25;
            }
            else if (salary >= 82251 && salary <= 171550) {
                tax = salary * 0.28;
            }
            else if (salary >= 171551 && salary <= 372950) {
                tax = salary * 0.33;
            }
            else if (salary >= 372951) {
                tax = salary * 0.35;
            }
        }
        
        else if (status == 1) {
            if (salary >= 0 && salary <= 16700) {
                tax = salary * 0.10;
            }
            else if (salary >= 16701 && salary <= 67900) {
                tax = salary * 0.15;
            }            
            else if (salary >= 67901 && salary <= 137050) {
                tax = salary * 0.25;
            }
            else if (salary >= 137051 && salary <= 208850) {
                tax = salary * 0.28;
            }
            else if (salary >= 208851 && salary <= 372950) {
                tax = salary * 0.33;
            }
            else if (salary >= 372951) {
                tax = salary * 0.35;
            }
        }
        
        else if (status == 2) {
            if (salary >= 0 && salary <= 8350) {
                tax = salary * 0.10;
            }
            else if (salary >= 8351 && salary <= 33950) {
                tax = salary * 0.15;
            }
            else if (salary >= 33951 && salary <= 68525) {
                tax = salary * 0.25;
            }
            else if (salary >= 68526 && salary <= 104425) {
                tax = salary * 0.28;
            }
            else if (salary >= 104426 && salary <= 186475) {
                tax = salary * 0.33;
            }
            else if (salary >= 186476) {
                tax = salary * 0.35;
            }
        }
        
        else if (status == 3) {
            if (salary >= 0 && salary <= 11950) {
                tax = salary * 0.10;
            }
            else if (salary >= 11951 && salary <= 45500) {
                tax = salary * 0.15;
            }
            else if (salary >= 45501 && salary <= 117450) {
                tax = salary * 0.25;
            }
            else if (salary >= 117451 && salary <= 190200) {
                tax = salary * 0.28;
            } 
            else if (salary >= 190201 && salary <= 372950) {
                tax = salary * 0.33;
            }
            else if (salary >= 372951) {
                tax = salary * 0.35;
            }
        }
        
        System.out.println("Your tax is: " + tax);
        
        
        
        //Counting tax using switch statement:
        
    
        
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
        
       
    }

}
