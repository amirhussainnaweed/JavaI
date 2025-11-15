package finding_gcd;
import java.util.Scanner;

public class Finding_gcd {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number 1:");
        int num1 = input.nextInt();
        System.out.println("enter the number 2:");
        int num2 = input.nextInt();
        
        int k = 1;
        int gcd = 0;
        while(k <= num1 && k <= num2){
            if(num1 % k == 0 && num2 % k == 0){
                gcd = k;}
            k++;
            
        }
        System.out.println("the gcd is: " + gcd);
        
     }
} 
