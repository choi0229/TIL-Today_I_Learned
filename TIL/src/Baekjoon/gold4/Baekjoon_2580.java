package Baekjoon.gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2580 {
	static int[][] arr = new int[9][9];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        backtrack(0, 0);
        System.out.println(sb);
    }
    static void backtrack(int row, int col){
        if(col == 9){
            backtrack(row+1, 0);
            return;
        }

        if(row == 9){
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }
        if(arr[row][col] == 0){
            for(int i = 1; i <= 9; i++){
                if(possible(row, col, i)){
                    arr[row][col] = i;
                    backtrack(row, col+1);
                    arr[row][col] = 0;
                }
            }
        }else{
            backtrack(row, col+1);
        }
        
    }
    static boolean possible(int row, int col, int num){
        for(int i = 0; i < 9; i++){
            if(arr[row][i] == num || arr[i][col] == num){
                return false;
            }            
        }
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for(int i = startRow ; i < startRow+3; i++){
            for(int j = startCol; j < startCol+3; j++){
                if(num==arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
