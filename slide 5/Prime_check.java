package prime_check;
import java.util.Scanner;

public class Prime_check {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("these are all prime numbers:\n");
        
        int num = 2;
        
        int lineCounter = 0;
        int primeCounter = 0;
        double a;
        
        while(primeCounter < 50){
            int count = 0;
            
            for(int i = 1; i <= num; i++){
                a = num % i;
                if (a == 0){
                    count++;
                }
            
            }
                if (count == 2){
                    System.out.print(num + "\t");
                    lineCounter++;
                    primeCounter++;
                    
                    if (lineCounter == 10){
                        System.out.println("");
                        lineCounter -= 10;
                    }
                }
            num++;
        }
        
        
     }
}        
