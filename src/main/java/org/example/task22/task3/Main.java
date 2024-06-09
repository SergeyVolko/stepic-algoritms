package org.example.task22.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int m = scanner.nextInt();
        System.out.println(getModNum(n, m));
    }

    static List<int[]> getDevIn(int m) {
        int[] lastPair = new int[]{0, 1};
        List<int[]> pairs = new ArrayList<>();
        pairs.add(lastPair);
        int[] newPair;
        do  {
            lastPair = pairs.get(pairs.size() - 1);
            newPair = new int[] {lastPair[1], (lastPair[0] + lastPair[1]) % m};
            pairs.add(newPair);
        } while (!(newPair[0] == 1 && newPair[1] == 0));
        return pairs;
    }

    static int getModNum(long n, int m) {
        List<int[]> pairs = getDevIn(m);
        long index = n % pairs.size();
        return pairs.get((int) index)[0];
    }

    static void printPairs(List<int[]> pairs) {
        for (int i = 0; i < pairs.size(); i++) {
            System.out.println(i + ":" + Arrays.toString(pairs.get(i)));
        }
    }
}
