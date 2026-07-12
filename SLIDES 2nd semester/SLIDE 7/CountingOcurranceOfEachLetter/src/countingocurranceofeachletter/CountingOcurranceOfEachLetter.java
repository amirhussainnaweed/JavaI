package countingocurranceofeachletter;

public class CountingOcurranceOfEachLetter {

    public static void main(String[] args) {

        char[] letters = new char[100];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ((int) ((Math.random() * 26) + 97));
        }

        for (int i = 97; i <= 122; i++) {
            int counter = 0;
            for (int j = 0; j < 100; j++) {
                if ((char) i == letters[j]) {
                    counter++;
                }
            }
            System.out.println("The occurance of " + (char) i + " is " + counter);
        }

    }

}
