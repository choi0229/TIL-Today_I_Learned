package Baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백트래킹 - N과 M (1)
public class Baekjoon_15649 {
	static int n, m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static boolean[] visited;
    
    public static void main(String[] args)throws IOException {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        arr = new int[m];

        backtrack(0);
        System.out.print(sb);
    }

    static void backtrack(int depth){
        if(depth==m){
            for(int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                backtrack(depth+1);
                visited[i] = false;
            }
        }
    }
}
