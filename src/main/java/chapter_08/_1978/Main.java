package chapter_08._1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int primeCount = 0;
        int count = Integer.parseInt(reader.nextLine());
        String[] numbers = reader.nextLine().split(" ");
        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(numbers[i]);
            if(isPrime(number)) {
                primeCount++;
            }
        }
        System.out.print(primeCount);
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i=2; i<=number/2; i++) {
            if (number%i == 0) return false;
        }
        return true;
    }
}
