package Baekjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 그리디알고리즘 - 강의실 배정
public class Baekjoon_11000 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[][] classes = new int[n][2];
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());

            classes[i][0] = Integer.parseInt(st.nextToken());
            classes[i][1] = Integer.parseInt(st.nextToken());
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(classes, (arr1, arr2)->{
            if(arr1[0]==arr2[0]){
                return arr1[1]-arr2[1];
            }else{
                return arr1[0]-arr2[0];
            }
        });
        // 첫 수업의 끝나는 시간 pq에 넣기
        pq.offer(classes[0][1]);
        for(int i = 1; i < n; i++){
            if(pq.peek()<=classes[i][0]){
                pq.poll();
            }
            pq.offer(classes[i][1]);
        }

        System.out.print(pq.size());
    }
}
