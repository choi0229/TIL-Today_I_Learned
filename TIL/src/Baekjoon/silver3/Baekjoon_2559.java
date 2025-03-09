package Baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 누적합
public class Baekjoon_2559 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[]result = new int[n+1];
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        int max = Integer.MIN_VALUE;
        int[] arr2 = new int[n+1];
        for(int i = 1; i <= n; i++){
            if(i >= m){
                arr2[i] = arr2[i-1] + arr[i] - arr[i-m];
                if(max < arr2[i]){
                    max = arr2[i];
                }
            }else{
                arr2[i] = arr[i] + arr2[i-1];
            }
        }
        System.out.println(max);
        
    }
}
