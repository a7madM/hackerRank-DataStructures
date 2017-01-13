package com.a7mad;

import java.util.Scanner;

/**
 * Created by a7mad on 13/01/17.
 */
// problem https://www.hackerrank.com/challenges/2d-array
public class TwoDArrayDS {
    Scanner scanner;

    public TwoDArrayDS() {
        scanner = new Scanner(System.in);
    }

    public int[][] getInput() {
        int[][] input = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        return input;
    }

    public int getMaxHourglass(int[][] input) {
        int max = 0;
        for (int i = 0; i < input.length - 2; i++) {
            for (int j = 0; j < input.length - 2; j++) {
                int sum = 0;
                sum += input[i][j];
                sum += input[i][j + 1];
                sum += input[i][j + 2];
                sum += input[i][j + 1];
                sum += input[i][j];
                sum += input[i][j + 1];
                sum += input[i][j + 2];

                if (max < sum)
                    max = sum;
            }
        }
        return max;
    }

}
