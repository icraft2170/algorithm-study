package chapter_05._4344;

import java.util.Scanner;

public class Main {

    public void solution(int[] num, int length, double avg) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (num[i] > avg) count++;
        }
        double percent =  count/(double)length * 100;
        String format = String.format("%.3f%s%n", percent, "%");
        System.out.print(format);
    }

    public int[] readerInts(Scanner reader) {
        int i = reader.nextInt();
        int[] numbers = new int[i];
        for (int j = 0; j < i; j++) {
            numbers[j] = reader.nextInt();
        }
        return numbers;
    }

    private int sumTotal(int[] number) {
        int total = 0;
        for (int i : number) {
            total += i;
        }
        return total;
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Main main = new Main();
        int num = Integer.parseInt(reader.nextLine());
        int[][] numbers = new int[num][];
        for (int i = 0; i < num; i++) {
            numbers[i] = main.readerInts(reader);
        }

        for (int i = 0; i < num; i++) {
            int size = numbers[i].length;
            int total = main.sumTotal(numbers[i]);
            double avg = (double) total / size;
            main.solution(numbers[i], size, avg);
        }

    }


}
