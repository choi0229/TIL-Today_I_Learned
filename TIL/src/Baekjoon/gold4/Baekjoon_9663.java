package Baekjoon.gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9663 {
	static int n, count = 0;
    static int[] arr;
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());
        arr = new int[n];
        backtrack(0);
        System.out.println(count);
    }
    static void backtrack(int depth){
        if(depth==n){
            count++;
            return;
        }

        for(int i = 0; i < n; i++){
            arr[depth] = i;
            if(possible(depth)){
                backtrack(depth+1);
            }
        }
    }
    static boolean possible(int col){
        for(int i = 0; i < col; i++){
            if(arr[i] == arr[col]){
                return false;
            }else if(Math.abs(col-i)==Math.abs(arr[i]-arr[col])){
                return false;
            }
        }
        return true;
    }
}
