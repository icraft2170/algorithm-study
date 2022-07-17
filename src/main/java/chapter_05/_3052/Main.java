package chapter_05._3052;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void solution(Integer[] numbers) {
        Set<Integer> collect = Arrays.stream(numbers)
                .collect(Collectors.toSet());
        int size = collect.size();
        System.out.println(size);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = reader.nextInt() % 42;
        }
        solution(numbers);
    }

}
