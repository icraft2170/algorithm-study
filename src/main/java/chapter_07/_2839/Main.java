package chapter_07._2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner reader = new Scanner(System.in);
        main.solution(reader.nextInt());
    }

    private void solution(int num) {
        int min = 3000;
        for (int i = 0; i <= 1700; i++) {
            for (int j = 0; j <= 1000; j++) {
                if (num == ((3 * i) + (5 * j))) {
                    min = Math.min(min, i + j);
                }
            }
        }
        if (min == 3000) min = -1;
        System.out.println(min);
    }
}
