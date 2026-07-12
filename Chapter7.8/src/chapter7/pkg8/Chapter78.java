package chapter7.pkg8;

import java.util.Scanner;

public class Chapter78 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for adding integer and 2 for double values:");
        int test = input.nextInt();

        if (test == 1) {
            int[] integers = new int[10];
            for (int i = 0; i < integers.length; i++) {
                System.out.println("Enter an integer value to add to the array:");
                integers[i] = input.nextInt();
            }
            double avg = average(integers);
            System.out.println("The average value of these integers is " + avg);
        }
        else if (test == 2) {
            double[] doubles = new double[10];
            for (int i = 0; i < doubles.length; i++) {
                System.out.println("Enter an double value to add to the array:");
                doubles[i] = input.nextDouble();
            }
            double avg = average(doubles);
            System.out.println("The average value of these doubles is " + avg);
        } else {
            System.out.println("Invalid input!");
        }

    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;

        return average;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;

        return average;
    }

}
