package chapter_05._4673;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public int d(int constructor) {
        String[] split = String.valueOf(constructor).split("");
        int total = 0;
        for (String s : split) {
            total += Integer.parseInt(s);
        }
        return constructor + total;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Set<Integer> number = new HashSet<>(10000) {
        };
        for (int i = 1; i <= 10000; i++) {
            number.add(i);
        }

        for (int i = 1; i <= 10000; i++) {
            number.remove(main.d(i));
        }
        number.forEach(System.out::println);
    }
}
