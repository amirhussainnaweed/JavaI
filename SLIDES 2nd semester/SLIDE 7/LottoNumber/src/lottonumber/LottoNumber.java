
package lottonumber;
import java.io.File;
import java.util.Scanner;

public class LottoNumber {

    public static void main(String[] args) throws Exception {
        
        boolean [] allNumbers = new boolean[100];
        
        Scanner scanner = new Scanner(new File("this.txt"));
       
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }
            if(num >= 1 && num <= 99){
                allNumbers[num] = true;
            } 
        }
        
        boolean allTrue = true;
        
        for(int i = 1; i <= 99; i++){
            if(!allNumbers[i]) allTrue = false;
        }
        
        if(allTrue) System.out.println("all numbers exist!");
        else System.out.println("some numbers are missing!");
        
        
    }
    
}
