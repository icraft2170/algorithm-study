package chapter_06._1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        main.solution(str);
    }

    private void solution(String str) {
        char[] chars = str.toUpperCase().toCharArray();
        int[] alphabets = new int[26];
        for (char ch : chars) {
            int index = ch - 65;
            alphabets[index] += 1;
        }

        int max = -1;
        int maxIndex = 0;
        for (int i = 0; i < 26; i++) {
            if (max < alphabets[i]) {
                max = alphabets[i];
                maxIndex = i;
            }
        }


        int maxCount = 0;
        for (int alphabet : alphabets) {
            if (alphabet == max) {
                maxCount++;
            }
        }

        if (maxCount > 1) {
            System.out.println("?");
        } else {
            System.out.println((char)(maxIndex + 65));
        }

    }
}
