package Baekjoon.bronze5;

import java.util.*;
import java.lang.*;
import java.io.*;

// 예제1 입력 : 0 1 2 2 2 7, 출력 : 1 0 0 0 0 1
// 예제2 입력 : 2 1 2 1 2 1, 출력 : -1 0 0 1 0 7

public class Baekjoon_3003 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arrStr = bf.readLine().split(" ");
        int[] arr = new int[arrStr.length];
        arr[0] = 1; arr[1] = 1; arr[2] = 2; arr[3] = 2; arr[4] = 2; arr[5] = 8;
        int[] input = new int[arrStr.length];
        for(int i = 0; i < arrStr.length; i++){
            input[i] = Integer.parseInt(arrStr[i]);
        }

        for(int i =0; i < arr.length; i++){
            arr[i] = arr[i] - input[i];
        }

        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[5]);
    }
}
