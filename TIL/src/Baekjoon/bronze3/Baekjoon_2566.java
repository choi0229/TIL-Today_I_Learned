package Baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2566 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int wid = 0;
        int len = 0;

        for(int i = 0; i < 9; i++){
            String[] arrStr = bf.readLine().split(" ");
            
            for(int k = 0; k < 9; k++){
                int num = Integer.parseInt(arrStr[k]);

                if(num>max){
                    max = num;
                    wid = i+1;
                    len = k+1;
                }
            }
        }
        if(max==0){
            wid = 1;
            len = 1;
        }
        System.out.println(max);
        System.out.println(wid+" "+len);
    }

}
