package org.example.task22.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getLastFiboNum(n));
    }

    static int getLastFiboNum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = (first + second) % 10;
            first = second;
            second = tmp;
        }
        return second;
    }
}
