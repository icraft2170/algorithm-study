package chapter_06._11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner reader = new Scanner(System.in);
        int count = Integer.parseInt(reader.nextLine());
        String numbers = reader.nextLine();
        main.solution(count, numbers);
    }

    private void solution(int count, String numbers) {
        char[] chars = numbers.toCharArray();
        int total = 0;
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                total += ch - 48;
            }
        }
        System.out.println(total);
    }
}
