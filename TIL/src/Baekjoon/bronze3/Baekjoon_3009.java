package Baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_3009 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[1000];
        int[] arr2 = new int[1000];
        for(int i = 0; i < 3; i++){
            String[] arrStr = bf.readLine().split(" ");
            int a = Integer.parseInt(arrStr[0]);
            int b = Integer.parseInt(arrStr[1]);
            arr[a-1]++;
            arr2[b-1]++;
        }
        int c =0;
        int d= 0;

        for(int j = 0; j < arr.length; j++){
            if(arr[j]==1){
                c = j+1;
            }
            if(arr2[j]==1){
                d = j+1;
            }
            if(c!=0 && d!=0){
                break;
            }
        }
        System.out.println(c+" "+d);
    }
}
