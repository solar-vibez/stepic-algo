package org.stepik.algo.part2_intro_theory_problems.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class FibBigInteger {
    private static BigInteger fibonacci(int number) {
        if (number == 1 || number == 2){
            return BigInteger.ONE;
        }
        BigInteger fibo1 = BigInteger.ONE;
        BigInteger fibo2 = BigInteger.ONE;
        BigInteger fibonacci = BigInteger.ZERO;
        for(int i = 3; i <= number; i++){
            fibonacci = fibo1.add(fibo2).mod(BigInteger.TEN);
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(fibonacci(scanner.nextInt()));
    }
}
