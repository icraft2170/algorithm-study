package chapter_08._2581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int min = 0;
        int count = 0;
        int total = 0;

        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                if (count == 0) min = i;
                count++;
                total += i;
                min = Math.min(min, i);
            }
        }

        if (count < 1) {
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(min);
        }

    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i=2; i<=number/2; i++) {
            if (number%i == 0) return false;
        }
        return true;
    }
}
