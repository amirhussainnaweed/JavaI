package chapter7.pkg7;

public class Chapter77 {

    public static void main(String[] args) {

        int[] counts = new int[10];

        int[] randoms = new int[100];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < 10; i++) {
            int counter = 0;
            for (int j = 0; j < randoms.length; j++) {
                if (randoms[j] == i) {
                    counter++;
                }
            }
            counts[i] = counter;
        }

        int counter = 0;
        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i] + " times number " + i + " is randomly generated!");

            counter += counts[i];
        }

        System.out.println("The total number is " + counter);

    }

}
