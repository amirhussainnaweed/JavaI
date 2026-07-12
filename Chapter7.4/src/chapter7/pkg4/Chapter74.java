
package chapter7.pkg4;

import java.util.Scanner;
import java.util.ArrayList;

public class Chapter74 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.println("Enter the scores and enter a negative number to end the the input!");
        
        ArrayList<Integer> scores = new ArrayList<>();
        
        int scoreAdd = 0;
        
        while(scoreAdd >= 0){
            System.out.println("enter a score:");
            scoreAdd = input.nextInt();
            scores.add(scoreAdd);
        }
        
        
        int total = 0;
        for(int i = 0; i < scores.size(); i++){
            total += scores.get(i);
        }
        
        double avg = total / scores.size();
        
        int aboveCounter = 0;
        for(int i = 0; i < scores.size(); i++){
            if(scores.get(i) >= avg) aboveCounter++;
        }
        
        System.out.println("Scores above the average is " + aboveCounter + " and score below the average is " + (scores.size() - aboveCounter));
        
    }
    
}
