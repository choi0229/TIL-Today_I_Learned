package Baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 서로 다른 부분 문자열의 개수
public class Baekjoon_11478 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bf.readLine();
        int len = s1.length();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < len; i++){
            for(int j = i+1; j <= len; j++){
                set.add(s1.substring(i,j));
            }
        }
        System.out.println(set.size());
    }
}
