package chapter_08._9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        try {
            int count = Integer.parseInt(br.readLine());
            for (int i = 0; i < count; i++) {
                num = Integer.parseInt(br.readLine());
                printPrime(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printPrime(int num){
        int[] primeArray = new int[num + 1];
        primeArray[0] = 0;
        primeArray[1] = 0;

        for (int i = 2; i <= num; i++) primeArray[i] = i;

        for(int i = 2; i < num;i++){
            if(primeArray[i] == 0) continue;
            for(int j = 2*i; j <=num; j+=i) primeArray[j] = 0;
        }

        for(int i = primeArray.length - 1 ; i == 0; i--) {
            if (primeArray[i] != 0) {
                while (num != 0) {
                    System.out.print(primeArray[i] + " ");
                    num -= primeArray[i];
                }
            }
        }
    }
}
