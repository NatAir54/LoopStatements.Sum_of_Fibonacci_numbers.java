package com.epam.rd.autotasks;
class LoopStatements {
    public static int task3(int n) throws IllegalArgumentException {
        if (n>0) {
            int[] numbers = new int[n];
            numbers[0] = 0;
            numbers[1] = 1;
            int sum = 1;
            for (int i = 2; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
                sum = sum + numbers[i];}
            return sum;
        } else {
            throw new IllegalArgumentException();}
    }
}
