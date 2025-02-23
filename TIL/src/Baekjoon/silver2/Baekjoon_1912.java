package Baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1912 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = arr[1];
        int max = dp[1];
        for(int i = 2; i <= n; i++){
            dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
            if(dp[i] > max){
                max = dp[i];
            }
            
        }
        System.out.println(max);
    }
}
