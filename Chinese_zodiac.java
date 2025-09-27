package javahomework;

import java.util.Scanner;

public class Chinese_zodiac {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year to check the animal of the year: ");
            int year = input.nextInt();

            int remaining = year % 12;

            switch (remaining) {
            	case 0: System.out.println("The animal is monkey!");
            		break;
            	case 1: System.out.println("The animal is rooster!");
            		break;
            	case 2: System.out.println("The animal is dog!");
            		break;
            	case 3: System.out.println("The animal is pig!");
            		break;
            	case 4: System.out.println("The animal is rat!");
            		break;
            	case 5: System.out.println("The animal is ox!");
            		break;
            	case 6: System.out.println("The animal is tiger!");
            		break;
            	case 7: System.out.println("The animal is rabbit!");
            		break;
            	case 8: System.out.println("The animal is dragon!");
            		break;
            	case 9: System.out.println("The animal is snake!");
            		break;
            	case 10: System.out.println("The animal is horse!");
            		break;
            	case 11: System.out.println("The animal is sheep!");
            		break;
        }
    }
 }
