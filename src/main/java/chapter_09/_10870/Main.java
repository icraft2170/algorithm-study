package chapter_09._10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number = Integer.parseInt(br.readLine());
            main.fibonacciNumber(number);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fibonacciNumber(Integer number) {
        int[] numbers = new int[number + 1];
        if (number == 0) {
            System.out.println(0);
            return;
        }
        if (number == 1) {
            System.out.println(1);
            return;
        }
        if (number > 1) {
            numbers[0] = 0;
            numbers[1] = 1;
            for (int i = 2; i <= number; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
            System.out.println(numbers[number]);
        }
    }
}
//        0
//        1
//        1
//        2
//        3
//        5
//        8
//        13
//        21
//        34
//        55
//        89
//        144
//        233
//        377
//        610
//        987
//        1597
//        2584
//        4181
//        6765