package chapter_06._1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        main.solution(str);
    }

    private void solution(String str) {
        str = str.trim();
        String[] strArray = str.split(" ");
        int length = strArray.length;
        System.out.print(length);
    }
}
