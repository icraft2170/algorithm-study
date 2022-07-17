package chapter_05._1546;

import java.util.Scanner;

public class Main {

    public static void solution(double max, double[] score) {
        double total = 0.0;
        for (double num : score) {
            total += (num / max) * 100;
        }
        System.out.println(total/score.length);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        double[] score = new double[num];
        score[0] = reader.nextInt();
        double max = score[0];
        for (int i = 1; i < num; i++) {
            score[i] = reader.nextInt();
            if (max < score[i]) max = score[i];
        }
        solution(max, score);
    }
}
