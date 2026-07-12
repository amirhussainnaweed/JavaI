package chapter7.pkg10;

import java.util.Scanner;

public class Chapter710 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("You will enter ten double values and the program return the index of the smallest element!");
        
        double [] numbers = new double [10];
        
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a double Value:");
            numbers[i] = input.nextDouble();
        }
        
        System.out.println("The index of the smallest element and it's minIndex is " + indexOfSmallestElement(numbers));
        

    }
    
    public static int indexOfSmallestElement(double [] array){
        int minIndex = 0;
        double min = array[0];
        
        for(int i = 0; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
}
