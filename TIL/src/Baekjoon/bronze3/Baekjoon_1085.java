package Baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1085 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arrStr = bf.readLine().split(" ");
        int[] arr = new int[arrStr.length];
        
        for(int i = 0; i < arrStr.length; i++){
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        int min = arr[0]-0;

        if(arr[1] < min){
            min = arr[1];
        }
        if(Math.abs(arr[0] - arr[2])<min && Math.abs(arr[0]-arr[2])!=0){
            min = Math.abs(arr[0] - arr[2]);
        }
        if(Math.abs(arr[1]-arr[3])<min && Math.abs(arr[1]-arr[3])!=0){
            min = Math.abs(arr[1]-arr[3]);
        }
        
        System.out.println(min);
    }
}
