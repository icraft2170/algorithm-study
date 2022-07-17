package chapter_07._1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();


        String str = null;
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            str = reader.readLine();
            String[] numbers = str.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            int c = Integer.parseInt(numbers[2]);
            main.solution(a, b, c);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void solution(int a, int b, int c) {
        if (c > b) {
            System.out.print((a / (c - b)) + 1);
        } else {
            System.out.print(-1);
        }
    }
}
