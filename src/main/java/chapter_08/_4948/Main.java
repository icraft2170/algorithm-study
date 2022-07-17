package chapter_08._4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int num1 = 0;
            int num2 = 0;
            try {
                String str = br.readLine();
                if (str.equals("0")) System.exit(0);
                num1 = Integer.parseInt(str);
                num2 = num1 * 2;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(countPrime(num1, num2));
        }

    }

    public static int countPrime(int num1, int num2){
        int[] primeArray = new int[num2 + 1];
        int count = 0;
        primeArray[0] = 0;
        primeArray[1] = 0;

        for (int i = 2; i <= num2; i++) primeArray[i] = i;

        for(int i = 2; i < num2;i++){
            if(primeArray[i] == 0) continue;
            for(int j = 2*i; j <=num2; j+=i) primeArray[j] = 0;
        }

        for(int i = 0; i <primeArray.length; i++)
            if (primeArray[i] != 0 && i > num1) count++;

        return count;
    }
}
