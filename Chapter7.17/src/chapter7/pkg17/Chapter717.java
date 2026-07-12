package chapter7.pkg17;

import java.util.Scanner;

public class Chapter717 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int studentNum = input.nextInt();

        int[] scores = new int[studentNum];
        String[] names = new String[studentNum];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter the student number " + (i + 1) + " score:");
            scores[i] = input.nextInt();
            System.out.println("Enter the student number " + (i + 1) + " name");
            names[i] = input.next();
        }

        sorted(scores, names);

    }

    public static void sorted(int[] number, String[] names) {
        int temp, maxIndex;
        String gemp;
        for (int i = 0; i < number.length - 1; i++) {
            maxIndex = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[maxIndex] < number[j]) {
                    maxIndex = j;
                }
            }
            temp = number[i];
            gemp = names[i];
            number[i] = number[maxIndex];
            names[i] = names[maxIndex];
            number[maxIndex] = temp;
            names[maxIndex] = gemp;
        }

        System.out.println("This are The students with their scores in order:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(names[i] + " " + number[i]);
        }
    }

}
