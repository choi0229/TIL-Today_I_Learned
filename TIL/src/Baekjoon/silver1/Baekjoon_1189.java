package Baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 컴백홈 - 백트래킹
public class Baekjoon_1189 {
	static int r, c, k;
    static String[][] arr;
    static int count = 0;
    static boolean[][] visited;
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new String[r][c];
        visited = new boolean[r][c];
        
        for(int i = 0; i < r; i++){
            String st2 = bf.readLine();
            for(int j = 0; j < c; j++){
                arr[i][j] = st2.charAt(j)+"";
            }
        }
        backtrack(r-1, 0, 1);
        System.out.println(count);
    }
    static void backtrack(int x, int y, int depth){
        if (x == 0 && y == c - 1) {
            if (depth == k) {
                count++;
            }
            return;
        }

        if (x < 0 || x >= r || y < 0 || y >= c || arr[x][y].equals("T") || visited[x][y]) {
            return;
        }
        visited[x][y] = true;
        backtrack(x-1, y, depth+1);
        backtrack(x+1, y, depth+1);
        backtrack(x, y-1, depth+1);
        backtrack(x, y+1, depth+1);
        visited[x][y] = false;
        
        
    }
}
