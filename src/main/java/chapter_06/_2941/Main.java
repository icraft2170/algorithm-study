package chapter_06._2941;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        main.solution(str);
    }

    private void solution(String str) {
        List<String> strings = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
        for (String st : strings) {
            System.out.println(str.contains(st));
        }
//        int count = 0;
//        for (String string : strings) {
//            System.out.println(string);
////            System.out.println(str.contains(string));
//            while (str.contains(string)) {
//                str.replace(string, "");
//                System.out.println(str);
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}
