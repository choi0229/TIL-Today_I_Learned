package Baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1075 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bf.readLine());
        long m = Long.parseLong(bf.readLine());
        long o = n-(n%100);
        long result = 0;
        for(long i = o; i <= o+99; i++){
            if(i%m==0){
                result = i;
                break;
            }
        }

        long n1 = result%100;
        if(n1<10){
            System.out.println("0"+n1);
        }else{
            System.out.println(n1);
        }
                                                                                                                                
    }
}
