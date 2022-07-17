package chapter_07._2775;

import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        int t = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(reader.nextLine());
            int n = Integer.parseInt(reader.nextLine());
            System.out.println(main.solution(k, n ));
        }
    }

    private long solution(int k, int n) {
        int total = 0;
        if (k == 0) {
            total += n;
            return total;
        }

        for (int i = 0; i < k; i++) {
            n = total(n);
//            total += n;
            System.out.println("n = " + n);
        }
        return total;
    }

    private int total(int n) {
        return (n * (n + 1)) / 2;
    }
}
