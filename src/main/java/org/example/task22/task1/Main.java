package org.example.task22.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonachi(n));
    }

    static long fibonachi(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long first = 0;
        long second = 1;
        for (int i = 2; i <= n; i++) {
            long tmp = first + second;
            first = second;
            second = tmp;
        }
       return second;
    }
}
