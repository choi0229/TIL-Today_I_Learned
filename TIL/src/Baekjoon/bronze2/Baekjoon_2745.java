package Baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2745 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] s1 = bf.readLine().split(" ");
        int n = Integer.parseInt(s1[1]);
        System.out.println(Integer.parseInt(s1[0],n));
    }
}
