package Baekjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// dp - 전깃줄
public class Baekjoon_2565 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n+1][n+1];
        for(int i = 1; i <= n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (arr1, arr2)->{
            return arr1[0] - arr2[0];
        });
        int[] dp1 = new int[n+1];
        int[] dp2 = new int[n+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                if(arr[i][0] > arr[j][0] && dp1[i] < dp1[j]+1){
                    dp1[i] = dp1[j]+1;
                }

                if(arr[i][1] > arr[j][1] && dp2[i] < dp2[j]+1){
                    dp2[i] = dp2[j]+1;
                }
            }
        }

        int max1 = 0;
        int max2 = 0;
        for(int i = 1; i <= n; i++){
            if(max1 < dp1[i]){
                max1 = dp1[i];
            }
            if(max2 < dp2[i]){
                max2 = dp2[i];
            }
        }

        int result = Math.abs(max1 - max2);
        System.out.println(result);
    }
}	
