package tuition_check;
import java.util.Scanner;

public class Tuition_check {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double tuition = 10000;
        double next = 0;
        int year = 0;
        
        while (tuition <= 20000){
            next = (tuition * 0.07);
            tuition = tuition + next;
            year++;
        }
        
        System.out.println("the tuition after " + year + " years becomes double!");
        
    }
}      
