
package randomCharacter;

import java.util.Scanner;

public class RandomCharacter {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char b = randomCharacter.getRandomCharacter();
        System.out.println(b);
    }
}

class randomCharacter {

    public static char getRandomChracter(char ch1, char ch2){

        return (char) (ch1 + ((Math.random() * (ch2 - ch1 + 1))));
    }

    public static char getRandomLowercase(){
        return getRandomChracter('a', 'z');
    }

    public static char getRandomUppercase(){
        return getRandomChracter('A', 'Z');
    }

    public static char getRandomDigit(){
        return getRandomChracter('0', '9');
    }

    public static char getRandomCharacter(){
        return getRandomChracter('\u0000', '\uFFFF');
    }

}
