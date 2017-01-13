package com.a7mad;

import java.util.Scanner;

/**
 * Created by a7mad on 13/01/17.
 */
// problem https://www.hackerrank.com/challenges/arrays-ds
public class ArrayDS {

    public int[] getInput() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public void solveProblem(int[] input) {
        for (int i = input.length - 1; i > -1; i--) {
            System.out.print(input[i] + " ");
        }
    }
}
