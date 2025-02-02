package Baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_24267 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long n= Long.parseLong(bf.readLine());
        long count = 0;
        long a = n-2;
        for(long i = 1; i <= n-2; i++){
            count += i*a;
            a--;
        }
        
    
        System.out.println(count);
        System.out.println(3);
    }
}
