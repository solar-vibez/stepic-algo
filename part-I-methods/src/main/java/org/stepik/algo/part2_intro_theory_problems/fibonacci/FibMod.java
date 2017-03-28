package org.stepik.algo.part2_intro_theory_problems.fibonacci;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FibMod {
    private static long fibonacci(long number, long m) {
        if (number < 2){
            return number;
        }
        List<Long> nums = new LinkedList<>();
        nums.add(0L);
        nums.add(1L);
        int i = 1;
        do {
            i++;
            nums.add((nums.get(i - 1) + nums.get(i - 2)) % m);
        } while (!(nums.get(i) == 1 && nums.get(i-1) == 0));
        long period = nums.size() - 2;
        int val = (int) (number % period);
        return nums.get(val);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.valueOf(scanner.next());
        long m = Long.valueOf(scanner.next());
        System.out.println(fibonacci(n, m));
    }
}
