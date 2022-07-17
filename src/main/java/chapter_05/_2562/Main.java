package chapter_05._2562;

import java.util.Scanner;

public class Main {

    public static void solution(int[] numbers) {
        int max = numbers[1];
        int maxIndex = 1;

        for (int i = 1; i < 9; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex + 1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            numbers[i] = reader.nextInt();
        }
        solution(numbers);
    }

}
