package chapter_08._1929;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = 0;
        int num2 = 0;
        try {
            String str = br.readLine();
            String[] s = str.split(" ");
            num1 = Integer.parseInt(s[0]);
            num2 = Integer.parseInt(s[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }


        printPrime(num1, num2);
    }

    public static void printPrime(int num1, int num2){
        int[] primeArray = new int[num2 + 1];
        primeArray[0] = 0;
        primeArray[1] = 0;

        for (int i = 2; i <= num2; i++) primeArray[i] = i;

        for(int i = 2; i < num2;i++){
            if(primeArray[i] == 0) continue;
            for(int j = 2*i; j <=num2; j+=i) primeArray[j] = 0;
        }

        for(int i = 0; i <primeArray.length; i++)
            if (primeArray[i] != 0 && i >= num1) System.out.println(primeArray[i]);

    }
//    public static int countPrime(int num1, int num2){
//        int[] primeArray = new int[num2 + 1];
//        int count = 0;
//        primeArray[0] = 0;
//        primeArray[1] = 0;
//
//        for (int i = 2; i <= num2; i++) primeArray[i] = i;
//
//        for(int i = 2; i < num2;i++){
//            if(primeArray[i] == 0) continue;
//            for(int j = 2*i; j <=num2; j+=i) primeArray[j] = 0;
//        }
//
//        for(int i = 0; i <primeArray.length; i++)
//            if (primeArray[i] != 0 && i > num1) count++;
//
//        return count;
//    }
}
