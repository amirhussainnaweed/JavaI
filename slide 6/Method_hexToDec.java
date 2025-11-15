
package method_hextodec;
import java.util.Scanner;
public class Method_hexToDec {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entert a hexadecimal value to convert to decimal:");
        String hexvalue = input.next();
        System.out.println("the dec value is " + Hex2Dec(hexvalue));
        
    }
    
    public static int Hex2Dec(String hex) {
    hex = hex.toUpperCase();
    int Alldec = 0;
    char hexdigit;
    int dec1 = 0;
    
    for (int i = 0; i < hex.length(); i++){
        
            hexdigit = hex.charAt(i);
            if (hexdigit >= '0' && hexdigit <= '9'){
                dec1 = hexdigit - '0';
                
            }
            else if (hexdigit >= 'A' && hexdigit <= 'F'){
                dec1 = (hexdigit - 'A') + 10;
                
            }
            double power = hex.length() - 1 - i;
        
        Alldec += dec1 * (int)Math.pow(16, power);
    }
    
        
        
    return Alldec;
    }
    
}
