package org.stepik.algo.part2_intro_theory_problems.fibonacci;


import java.util.Scanner;

public class FibRecursive {

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(fibonacci(scanner.nextInt()));
    }
}
