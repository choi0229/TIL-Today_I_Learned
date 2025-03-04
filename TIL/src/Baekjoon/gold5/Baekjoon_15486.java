package Baekjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 퇴사 2
public class Baekjoon_15486 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n+1][2];
        int[] dp = new int[n+2];
        for(int i = 1; i <= n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= n; i++){
            int index = i + arr[i][0];
            dp[i] = Math.max(dp[i], dp[i-1]);
            if(index <= n+1){
                dp[index] = Math.max(dp[index], arr[i][1] + dp[i]); 
            }
        }

        System.out.println(Math.max(dp[n], dp[n+1]));
    }
}
