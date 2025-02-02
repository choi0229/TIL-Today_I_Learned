package Baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_24313 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arrStr = bf.readLine().split(" ");
        int a1 = Integer.parseInt(arrStr[0]);
        int a0 = Integer.parseInt(arrStr[1]);

        int c = Integer.parseInt(bf.readLine());
        int n0 = Integer.parseInt(bf.readLine());

        boolean result = true;

        for(int i = n0; i <= 100; i++){
            int fn = a1 * i + a0;
            int gn = c*i;
            if(fn > gn){
                result = false;
                break;
            }
        }

        if(result){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
    }
}
