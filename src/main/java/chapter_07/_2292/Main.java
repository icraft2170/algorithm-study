package chapter_07._2292;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        main.solution(n);
    }

    private void solution(int n) {
        if (n == 1) {
            System.out.println(1);
            System.exit(0);
        }
        for (int i = 0; i < 10000000; i++) {
            if (n > (3 * (i - 1) * (i - 2) + 1)) {
                if (n <= 3 * i * (i - 1) + 1) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
