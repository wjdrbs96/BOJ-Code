package Baekjoon.Java.BOJ11000;

import java.util.Scanner;

public class Main_11022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();

            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (int)(a + b));
        }
    }
}