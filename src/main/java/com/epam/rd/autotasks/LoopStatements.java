package com.epam.rd.autotasks;
class LoopStatements {
    public static int task3(int n) {
        if (n>0) {
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + fib[i];
            }
            return sum;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
