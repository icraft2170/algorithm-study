package chapter_05._8958;

import java.util.Scanner;
public class Main {
    public void solution(String str) {
        char[] chars = str.toCharArray();
        int score = 0;
        int count = 1;
        for (char ch : chars) {
            if (ch == 'O') {
                score += count;
                count++;
                continue;
            }
            count = 1;
        }
        System.out.println(score);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());
        Main main = new Main();
        for (int i = 0; i < number; i++) {
            main.solution(reader.nextLine());
        }

    }

}
