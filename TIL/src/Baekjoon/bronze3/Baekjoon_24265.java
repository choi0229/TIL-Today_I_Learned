package Baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_24265 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bf.readLine());
        long count = 0;

        for(long i = n-1; i > 0; i--){
            count += i;
        }
        
        System.out.println(count);
        System.out.println(2);
    }
}
