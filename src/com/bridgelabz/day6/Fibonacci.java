package com.bridgelabz.day6;

public class Fibonacci {
    public static void main(String[] args) {
        int n, f1 = 0, f2 = 1;
        n = 10;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(f1 + " + ");

            int sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
    }
}
