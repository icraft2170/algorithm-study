package chapter_09._10872;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number = Integer.parseInt(br.readLine());
            main.factorial(number);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void factorial(Integer number) {
        Long total = 1L;
        for (int i = 1; i <= number; i++) {
            total *= i;
        }
        System.out.println(total);
    }
}
