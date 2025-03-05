package Baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// dp 카드구매하기2
public class Baekjoon_16194 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i <= n; i++){
            dp[i] = dp[i-1] + arr[1]; 
            for(int j = 1; j <= i; j++){
                dp[i] = Math.min(dp[i], dp[i-j] + arr[j]);
            }
        }

        System.out.println(dp[n]);
    }
}
