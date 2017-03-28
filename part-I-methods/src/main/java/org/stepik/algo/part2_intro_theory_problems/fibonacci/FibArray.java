package org.stepik.algo.part2_intro_theory_problems.fibonacci;

import java.util.Scanner;

public class FibArray {
    private static long fibonacci(int n) {
        if (n == 1 || n == 2){
            return 1;
        }
        int[] numbers = new int[n];
        numbers[0] = 1;
        numbers[1] = 1;
        for(int i = 2; i < n; i++) {
            numbers[i] = (numbers[i-1] + numbers[i-2]);
        }
        return numbers[n-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(fibonacci(scanner.nextInt()));
    }
}
