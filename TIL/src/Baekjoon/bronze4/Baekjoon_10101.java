package Baekjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10101 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];
        int sum = 0;
        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum+= arr[i];
        }

        if(sum==180){
            if(arr[0]==arr[1]&& arr[0]==arr[2]){
                System.out.println("Equilateral");
            }else if((arr[0]==arr[2])||(arr[0]==arr[1]) ||(arr[1]==arr[2])){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }else{
            System.out.println("Error");
        }
        
    }
}
