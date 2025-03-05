package Baekjoon.gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// dp 가장긴 바이토닉 부분수열
public class Baekjoon_11054 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        int[] dp2 = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                if(arr[i] > arr[j] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        for(int i = n; i >= 1; i--){
            dp2[i] = 1;
            for(int j = n; j > i; j--){
                if(arr[i] > arr[j] && dp2[i] < dp2[j] + 1){
                    dp2[i] = dp2[j] + 1;
                }
            }
        }
        
        int max = 0;
        for(int i = 1; i <= n; i++){
            int sum = dp[i] + dp2[i];
            if(max < sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}	
