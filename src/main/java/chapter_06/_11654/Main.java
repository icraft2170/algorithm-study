package chapter_06._11654;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        main.solution(str);
    }

    public void solution(String str) {
        System.out.println(Character.codePointAt(str.toCharArray(), 0));
    }
}
