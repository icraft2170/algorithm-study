package chapter_06._2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner reader = new Scanner(System.in);
        int count = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < count; i++) {
            int repeatCount = reader.nextInt();
            String str = reader.nextLine();
            main.solution(repeatCount, str);
        }
    }

    private void solution(int repeatCount, String str) {
        str = str.trim();
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : chars) {
            for (int i = 0; i < repeatCount; i++) {
                stringBuilder.append(ch);
            }
        }
        System.out.println(stringBuilder);
    }
}
