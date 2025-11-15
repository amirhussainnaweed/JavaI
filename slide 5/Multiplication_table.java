
package multiplication_table;
import java.util.Scanner;

public class Multiplication_table {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("this program will print multiplication table: "
                         + "\n");
        
        int count = 0;
        
        for(int i = 1; i <= 10; i++){
            for(int j = 2; j <= 10; j++){
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
                count++;
                if (count == 9){
                   System.out.println("");
                   count -= 9;
                }
            }
        }
        

    }
}
