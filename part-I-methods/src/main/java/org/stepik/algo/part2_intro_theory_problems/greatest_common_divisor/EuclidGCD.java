package org.stepik.algo.part2_intro_theory_problems.greatest_common_divisor;


import java.util.Scanner;

class EuclidGCD {

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a >= b) {
            return gcd(a % b, b);
        }
        if(b >= a) {
            return gcd(a, b % a);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
}
