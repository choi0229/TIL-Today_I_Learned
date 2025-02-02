package Baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Baekjoon_1427 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ns = bf.readLine();
        Integer[] n = new Integer[ns.length()];
        for(int i = 0; i < n.length; i++){
            n[i] = ns.charAt(i)-'0'; 
        }
        Arrays.sort(n, Collections.reverseOrder());
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i]);
        }
    }
}	
