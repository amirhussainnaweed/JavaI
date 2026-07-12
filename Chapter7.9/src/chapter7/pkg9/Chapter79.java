package chapter7.pkg9;

import java.util.Scanner;

public class Chapter79 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("You will enter ten double values and the program will find the smallest!");
        
        double [] numbers = new double [10];
        
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a double value:");
            numbers[i] = input.nextDouble();
        }
        
        System.out.println("The Smallest number here is " + min(numbers));
        
        
    }
    
    public static double min(double [] array){
        double min = array[0];
        
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        
        return min;
    }
    
}
