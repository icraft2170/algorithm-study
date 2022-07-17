package chapter_05._1065;

import java.util.Scanner;

public class Main {

    private boolean checkHanNumber(int num) {
        String str = String.valueOf(num);
        String[] split = str.split("");
        int firstTerm = Integer.parseInt(split[0]);
        int i1 = Integer.parseInt(split[0]) - Integer.parseInt(split[1]);
        for (int i = 1; i < str.length(); i++) {
//            if (Integer.parseInt(split[i]) == )
//            firstTerm + (i - 1);
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        Main main = new Main();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (main.checkHanNumber(i)) count++;
        }
        System.out.println(count);
    }

}
