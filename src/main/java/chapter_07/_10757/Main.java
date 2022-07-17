package chapter_07._10757;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] str = reader.nextLine().split(" ");
        BigDecimal num1 = new BigDecimal(str[0]);
        BigDecimal num2 = new BigDecimal(str[1]);
        System.out.println(num1.add(num2).toString());
    }
}

