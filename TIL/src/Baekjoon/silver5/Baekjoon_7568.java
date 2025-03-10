package Baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_7568 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        
        int[] m = new int[n];
        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++){
            String[] arrStr = bf.readLine().split(" ");
            for(int j = 0; j < 2; j++){
                arr[i][j] = Integer.parseInt(arrStr[j]);
            }
        }
        
        for(int i = 0; i< n; i++){
            int rank = 1;
            for(int j = 0; j < n; j++){
                if(arr[i][0]<arr[j][0]){
                    if(arr[i][1]<arr[j][1]){
                        rank+=1;
                    }
                }
            }
            m[i] = rank;
        }

        for(int i = 0; i < n-1; i++){
            System.out.print(m[i]+" ");
        }
        System.out.print(m[n-1]);
        
    }
}
