package chapter_07._2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = reader.readLine();
            String[] numbers = str.split(" ");
            int solution = main.solution(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]), Integer.parseInt(numbers[2]));
            System.out.println(solution);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private int solution(int a, int b, int v) {
        if (a == v) return 1;
        return (int)Math.ceil((double)(v - a) / (a - b) + 1);
    }
}
