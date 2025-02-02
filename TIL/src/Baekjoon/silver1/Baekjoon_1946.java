package Baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 신입사원
public class Baekjoon_1946 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        

        for(int i = 0; i < n; i++){
            int m = Integer.parseInt(bf.readLine());
            int[][] arr = new int[m][2];
            
            for(int j = 0; j < m; j++){
                StringTokenizer st = new StringTokenizer(bf.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }
            // 서류점수 배열 기준 정렬
            Arrays.sort(arr, (arr1, arr2) -> {
                return arr1[0]-arr2[0];
            });
            
            int firstInterview = arr[0][1];
            int count = 1;
           
            for(int j = 0; j < m; j++){
                if(firstInterview > arr[j][1]){
                    firstInterview = arr[j][1];
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
    }
}
