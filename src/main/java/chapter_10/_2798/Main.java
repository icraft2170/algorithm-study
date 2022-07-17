package chapter_10._2798;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int result = search(arr, N, M);
        System.out.println(result);
    }

    static int search(int[] arr, int N, int M) {
        int result = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > M) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > M) continue;
                for (int k = j + 1; k < arr.length; k++) {
                    int tmp = arr[i] + arr[k] + arr[j];
                    if (tmp > M) continue;
                    if (M - result > M - tmp) {
                        result = tmp;
                    }
                }
            }
        }

        return result;
    }
}

