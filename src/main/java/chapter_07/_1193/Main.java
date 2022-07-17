package chapter_07._1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();

        Main main = new Main();
        main.solution(num);
    }

    private void solution(int num) {
        int diagonal = 0;
        for (int i = 0; i < 50000; i++) {
            if (((i - 1) * i) / 2 < num) {
                if (((i + 1) * i / 2) >= num) {
                    diagonal = i;
                    break;
                }
            }
        }
        boolean isEven = (diagonal % 2) == 0;
        int sum = diagonal + 1;
        if (isEven) {
            
        }

    }
}
