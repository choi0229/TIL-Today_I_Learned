package Baekjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 선발명단 - 백트래킹
public class Baekjoon_3980 {
	static int[][] arr;
    static boolean[] visited;
    static int max;
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());
        for(int k = 0; k < n; k++){
            max = Integer.MIN_VALUE;
            arr = new int[11][11];
            visited = new boolean[11];
            for(int i = 0; i < 11; i++){
                StringTokenizer st = new StringTokenizer(bf.readLine());
                for(int j = 0; j < 11; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
    
            backtrack(0, 0);
            System.out.println(max);
        }
        
        
    }
    static void backtrack(int depth, int stat){
        if(depth==11){
            if(max < stat){
                max = stat;
            }
            return;
        }

        for(int i = 0; i < 11; i++){
            if(!visited[i] && arr[depth][i]!=0){
                visited[i] = true;
                backtrack(depth + 1, stat + arr[depth][i]);
                visited[i] = false;
            }
        }
    }
}
