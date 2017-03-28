package org.stepik.algo.part2_intro_theory_problems.greatest_common_divisor;

import java.util.Scanner;

class NaiveGCD {
    private static int gcd(int a, int b){
        int gcd = 1;
        int max = Math.max(a, b);
        for (int i = 2; i < max; i++){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));

    }
}
