package chapter_06._1316;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner reader = new Scanner(System.in);
        int count = Integer.parseInt(reader.nextLine());
        int sum = 0;
        for (int i = 0; i < count; i++) {
            String str = reader.nextLine();
            int solution = main.solution(str);
            sum += solution;
        }
        System.out.println(sum);
    }

    private int solution(String str) {
        str = str.toLowerCase();
        for (int i = 97; i < 123; i++) {
            int i1 = str.indexOf(i);
            int i2 = str.lastIndexOf(i);
            int finalI = i;
            long count = str.chars().filter(ch -> ch == (char) finalI).count();
            int abs = Math.abs(i1 - i2);
            if (i1 != i2) {
                if (abs != count -1 ) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
