package Baekjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 캠프 준비 - 백트래킹
public class Baekjoon_16938 {
	static int n, l, r, x;
    static int[] arr;
    static int count = 0;
    static boolean[] visited;
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken()); // 문제의 갯수
        l = Integer.parseInt(st.nextToken()); // 문제 난이도의 합은 L보다 크고
        r = Integer.parseInt(st.nextToken()); // 문제 난이도의 합은 r본다 작다
        x = Integer.parseInt(st.nextToken()); // 가장어려운 문제와 쉬운 문제의 난이도 차이는 x보다 크거나 같아야한다.

        arr = new int[n];
        visited = new boolean[n];
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int max = 0;
        int min = r;
        backtrack(0, 0, max, min, 0);
        System.out.println(count);
    }

    static void backtrack(int depth, int sum, int max, int min, int index){
        if(index>= 2 && l <= sum && r >= sum && (max - min)>=x){
            count++;
        }
        if(r < sum || depth > n){
            return;
        }
        for(int i = depth; i < n; i++){
            int a = max;
            int b = min;
            if(max<arr[i]){
               a = arr[i];
            }
            if(min>arr[i]){
               b = arr[i];
            }
            backtrack(i+1, sum+arr[i], a, b, index+1);
            
        }
    }
}
