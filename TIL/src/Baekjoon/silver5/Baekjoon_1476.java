package Baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1476 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arrStr = bf.readLine().split(" ");
        int[] input = new int[3];
        input[0] = Integer.parseInt(arrStr[0]);
        input[1] = Integer.parseInt(arrStr[1]);
        input[2] = Integer.parseInt(arrStr[2]);
        
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        
        int result = 1;
        for(int i = 0; i < 1000000; i++){
            if(arr[0]>15){
                arr[0] = 1;
            }
            if(arr[1]>28){
                arr[1] = 1;
            }
            if(arr[2]>19){
                arr[2] = 1;
            }
            if(arr[0]==input[0] && arr[1]==input[1] && arr[2]==input[2]){
                break;
            }
            arr[0]++;
            arr[1]++;
            arr[2]++;
            result++;
            
        }

        System.out.println(result);
        
    }
}
