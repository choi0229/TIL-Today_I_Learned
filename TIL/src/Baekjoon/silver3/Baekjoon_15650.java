package Baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백트래킹 - N과 M(2)
public class Baekjoon_15650 {
	static int arr[];
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        backtrack(0, 1);
        System.out.print(sb);
        
    }

    static void backtrack(int depth, int start){
        if(depth==m){
            for(int num: arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i <= n; i++){
            arr[depth] = i;
            backtrack(depth+1, i+1);
        }
    }
}
