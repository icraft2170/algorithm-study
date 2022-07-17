package chapter_06._5652;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        main.solution(str);
    }

    private void solution(String str) {
        String[] strArray = str.split(" ");
        int first = Integer.parseInt(new StringBuilder(strArray[0]).reverse().toString());
        int second = Integer.parseInt(new StringBuilder(strArray[1]).reverse().toString());
        System.out.println(Integer.max(first, second));
    }
}
