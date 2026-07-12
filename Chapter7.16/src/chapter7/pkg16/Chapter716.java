package chapter7.pkg16;

import java.util.Scanner;

public class Chapter716 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] randoms = new int[100000];

        int key = 0;

        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 101);
            if (i == 99999) {
                key = (int) (Math.random() * 101);
            }
        }

        int indexOfKey = linearSearch(randoms, key);
        System.out.println("The index of the key in this array is " + indexOfKey);

    }

    public static int linearSearch(int[] arr, int key) {
        long endTime = 0;
        long startTime = 0;
        for (int i = 0; i < arr.length; i++) {
            startTime = System.nanoTime();
            if (key == arr[i]) {
                endTime = System.nanoTime();
                long executionTime = endTime - startTime;
                System.out.println("The execution time is " + executionTime);
                return i;
            }
        }

        return -1;
    }

}
