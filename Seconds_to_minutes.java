//Name: Amir Hussain Naweed 
//Instructor: Ahmad Roheed Khaliqyar
//Class: IS Department first semester
//Date: September 26, 2025
//This is a program that ask user to enter a city name and the program will show the local timezone

package seconds_to_minutes;

import java.util.Scanner;

public class Seconds_to_minutes {

   
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
      
      
      System.out.println("Enter the city where you live to check the local time: ");
      System.out.println("Make sure the spelling is correct! \nDo NOT give space between the letters!");
      String name = input.next();
      System.out.println("");
      
              
              
      if (name.equalsIgnoreCase("Kabul")) { 
          
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60) + 30;
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour + 4)%24;
      
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
      
       else if (name.equalsIgnoreCase("Washington")) {
          
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour - 4)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      } 
        else if (name.equalsIgnoreCase("Denver")) {
            
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour - 6)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("Seoul")) {
         
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour + 9)%24;  
        
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      } 
        else if (name.equalsIgnoreCase("Dubai")) {
        
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour + 4)%24; 
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("London")) {
        
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour + 1)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("Tokyo")) {
        
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour + 9)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("Sydney")) {
        
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour + 10)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("Rome")) {
        
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour + 2)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("BuenosAires")) {
        
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour - 3)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("Berlin")) {
        
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour + 2)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("Vancouver")) {
        
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour - 7)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("Baghdad")) {
        
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour + 3)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("NewYork")) {
        
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour - 4)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("Barcelona")) {
         
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour + 2)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else if (name.equalsIgnoreCase("Brasilia")) {
            
          long total_second_millis = System.currentTimeMillis();
          long total_second = total_second_millis/1000;
          long currentSecond = total_second % 60;
          long total_minute = (total_second/60);
          long current_minute = (total_minute) % 60;
          long total_hour = (total_minute)/60;
          long current_hour = (total_hour - 3)%24;
          
        System.out.println(current_hour + ":" + current_minute + ":" + currentSecond);
      }
        else {
            
        System.out.println("City not found! \nCheck the spelling! \nOr enter a valid name!");
      }
      
      
      
    }
    
}
