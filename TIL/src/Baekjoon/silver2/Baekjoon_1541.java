package Baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 잃어버린 괄호
public class Baekjoon_1541 {
	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), "-");
        int sum = Integer.MAX_VALUE;
        
        while(st.hasMoreTokens()){
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");

            int temp = 0;
            while(st2.hasMoreTokens()){
                temp += Integer.parseInt(st2.nextToken());
            }

            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }else{
                sum -= temp;
            }
        }
        System.out.print(sum);
	}
}
