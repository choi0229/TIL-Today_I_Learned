package Baekjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// dp - 배낭문제
public class Baekjoon_12865 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] values = new int[n+1];
        int[] weights = new int[n+1];
        for(int i = 1; i <= n; i++){
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            weights[i] = Integer.parseInt(st2.nextToken());
            values[i] = Integer.parseInt(st2.nextToken());
        }
        int[] dp = new int[k+1];
        for(int i = 1; i <= n; i++){
            int weight = weights[i];
            for(int j = k; j >= weight; j--){
                dp[j] = Math.max(dp[j], dp[j-weight] + values[i]);
            }
        }
        System.out.println(dp[k]);
    }
	
	/*
	 * public static void main(String[] args)throws IOException { BufferedReader bf
	 * = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer st =
	 * new StringTokenizer(bf.readLine()); int n = Integer.parseInt(st.nextToken());
	 * int k = Integer.parseInt(st.nextToken());
	 * 
	 * int[] v = new int[n+1]; int[] w = new int[n+1]; for(int i = 1; i <= n; i++){
	 * StringTokenizer st2 = new StringTokenizer(bf.readLine()); w[i] =
	 * Integer.parseInt(st2.nextToken()); v[i] = Integer.parseInt(st2.nextToken());
	 * } int[][] dp = new int[n+1][k+1]; for(int i = 1; i <= n; i++){ for(int j = 1;
	 * j <= k; j++){ int weight = w[i]; if(weight > j){ dp[i][j] = dp[i-1][j];
	 * }else{ dp[i][j] = Math.max(dp[i-1][j], v[i] + dp[i-1][j-weight]); } } }
	 * System.out.println(dp[n][k]); }
	 */
}
