package chapter_06._10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        main.solution(str);
    }

    private void solution(String str) {
        char[] chars = str.toCharArray();
        for (int i = 97; i < 123; i++) {
            boolean flag = false;
            for (int j = 0; j < chars.length; j++) {
                if(chars[j] == (char) i) {
                    System.out.print(j + " ");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(-1 + " ");
            }
        }
    }
}
