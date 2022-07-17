package chapter_08._11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        try {
            String str = br.readLine();
            String[] s = str.split(" ");
            num = Integer.parseInt(s[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }


        printPrime(num);
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

        for(int i = 0; i <primeArray.length; i++)
            if (primeArray[i] != 0) {
                while (num % primeArray[i] == 0) {
                    System.out.println(primeArray[i]);
                    num /= primeArray[i];
                }
            }

    }
}
