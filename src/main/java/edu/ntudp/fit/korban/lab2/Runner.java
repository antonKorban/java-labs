package edu.ntudp.fit.korban.lab2;

import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int[][] inputMatrix = new int[10][20];
        Random myRandom = new Random();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Random (1) or Scanner (2)?");
        int choice1 = myScanner.nextInt();

        if (choice1 == 1) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 20; j++) {
                    inputMatrix[i][j] = myRandom.nextInt(100);
                    System.out.print(inputMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else if (choice1 == 2) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print("Input [" + (i + 1) + "][" + (j + 1) + "]: ");
                    inputMatrix[i][j] = myScanner.nextInt();
                }
            }
            myScanner.close();
            System.out.println("Scanner manual:");

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print(inputMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
            return;
        }

        int min = inputMatrix[0][0];
        int max = inputMatrix[0][0];
        double sum = 0;
        int totalElements = 10 * 20;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                sum += inputMatrix[i][j];

                if (inputMatrix[i][j] < min) {
                    min = inputMatrix[i][j];
                }

                if (inputMatrix[i][j] > max) {
                    max = inputMatrix[i][j];
                }
            }
        }

        double average = sum / totalElements;

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        System.out.println("Average: " + average);
    }
}
