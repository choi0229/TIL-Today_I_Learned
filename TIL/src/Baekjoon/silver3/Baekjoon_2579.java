package Baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2579 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(bf.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }

        if (n == 1) {
            System.out.println(arr[1]);
            return;
        }

        if (n == 2) {
            System.out.println(arr[1] + arr[2]);
            return;
        }
        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        if(n>2){
            dp[3] = Math.max(arr[1] + arr[3], arr[2] + arr[3]);
        }
        for(int i = 4; i <= n; i++){
            dp[i] = Math.max(dp[i-3] + arr[i-1] + arr[i], dp[i-2]+arr[i]);
        }

        

        System.out.println(dp[n]);
        
    }
}
