package com.bridgelabz.day6;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of distinct coupon numbers: ");
            int n = sc.nextInt();
            int[] coupons = new int[n];
            for (int i = 0; i < n; i++) {
                coupons[i] = i + 1;
            }
            int count = 0;
            boolean[] used = new boolean[n];
            while (!allUsed(used)) {
                int random = getRandom(n);
                if (!used[random]) {
                    used[random] = true;
                }
                count++;
            }
            System.out.println("Total random number needed to have all distinct numbers: " + count);
        }

        public static int getRandom(int n) {
            Random rand = new Random();
            return rand.nextInt(n);
        }

        public static boolean allUsed(boolean[] used) {
            for (boolean b : used) {
                if (!b) {
                    return false;
                }
            }
            return true;
        }
    }