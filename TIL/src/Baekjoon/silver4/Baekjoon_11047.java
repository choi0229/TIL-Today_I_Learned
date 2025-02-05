package Baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11047 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(bf.readLine());
            arr[i] = a;
        }

        int result = 0;
        while(k!=0){
            result += k/arr[n-1];
            k = k%arr[n-1];
            n--;
        }

        System.out.println(result);
	}
}
