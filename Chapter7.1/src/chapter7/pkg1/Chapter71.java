
package chapter7.pkg1;

import java.util.Scanner;

public class Chapter71 {

  
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter the number of students:");
            int numOfStudents = input.nextInt();
            
            double [] scores = new double[numOfStudents];
            double max = scores[0];
            
            
            for(int i = 0; i < scores.length; i++){
                System.out.println("Enter the score of student number " + (i + 1));
                scores[i] = input.nextDouble();
                if(scores[i] > max) max = scores[i];
            }
            
            for(int i = 0; i < scores.length; i++){
                char grade = (char)(1);
                if(scores[i] >= (max - 10)) grade = (char)(65);
                else if(scores[i] >= (max - 20)) grade = (char)(66);
                else if(scores[i] >= (max - 30)) grade = (char)(67);
                else if(scores[i] >= (max - 40)) grade = (char)(68);
                else grade = (char)(70);
                
                System.out.println("The student number " + (i + 1) + " score is " + (int)scores[i] + " and grade is " + grade);
             }
        
           

    }
    
}
