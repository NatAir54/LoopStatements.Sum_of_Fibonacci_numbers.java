package com.epam.rd.autotasks;
    class LoopStatements {
        public static int task3(int n) {
            if (n<=0) {
                throw new IllegalArgumentException();}
            else if (n==1) return 0;
            else if (n==2) return 1;
            else if (n==3) return 2;
            else {
                int[] numbers = new int[n];
                numbers[0] = 0;
                numbers[1] = 1;
                int sum = 1;
                for (int i = 2; i < numbers.length; i++) {
                    numbers[i] = numbers[i - 1] + numbers[i - 2];
                    sum = sum + numbers[i];}
                return sum;
            }
        }
    }

