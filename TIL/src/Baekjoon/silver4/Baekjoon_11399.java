package Baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// ATM
public class Baekjoon_11399 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        String[] arrStr = bf.readLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        Arrays.sort(arr);
        int sum = 0;
        int result = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            arr[i] = sum;
            result += arr[i];
        }
        System.out.print(result);
    }
}
