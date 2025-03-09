package Baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 누적합
public class Baekjoon_11659 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] += arr[i-1] + Integer.parseInt(st2.nextToken());
        }
        
        int[] result = new int[m];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++){
            StringTokenizer st3 = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st3.nextToken());
            int end = Integer.parseInt(st3.nextToken());
            sb.append(arr[end]-arr[start-1]).append("\n");
        }
        System.out.println(sb);
        
    }
}
