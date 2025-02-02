package Baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2903 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int result = 2;
        for(int i = 1; i <= n; i++){
            result = (result-1) + result;
        }
        System.out.println(result*result);
    }
}
