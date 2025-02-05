package Baekjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 회의실 배정
public class Baekjoon_1931 {
	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (arr1, arr2) -> {
            if(arr1[1]==arr2[1]){
                return arr1[0]-arr2[0];
            }else{
                return arr1[1]-arr2[1];
            }
        });
        int count = 0;
        int endTime = 0;
        
        for(int i = 0; i < n; i++){
            if(endTime <= arr[i][0]){
                endTime = arr[i][1];
                count++;
            }
        }
        System.out.print(count);
    }
}
