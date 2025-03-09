package Baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 누적합
public class Baekjoon_16139 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bf.readLine();
        char[] arr = s1.toCharArray();
        
        int n = Integer.parseInt(bf.readLine());
        int[][] arr2 = new int[arr.length+1][26];
        for(int i = 0; i < arr.length; i++){
            int num = arr[i] - 'a';
            
            for (int j = 0; j < 26; j++) {
                arr2[i+1][j] = arr2[i][j]; 
            }
            arr2[i+1][num]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            char c = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int num = c - 'a';
            int result = arr2[end+1][num] - arr2[start][num]; 
            sb.append(result).append("\n");
        }
        System.out.println(sb);
        
    }
}
