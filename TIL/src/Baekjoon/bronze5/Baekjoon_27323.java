package Baekjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_27323 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        
        System.out.println(a*b);
    }
}
