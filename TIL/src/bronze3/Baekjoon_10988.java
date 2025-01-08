package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10988 {
	public static void main(String[] args)throws IOException {
		// 예제1 입력 : level, 출력 : 1
		// 예제2 입력 : baekjoon, 출력 : 0
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        StringBuilder reverse = new StringBuilder();

        for(int i = input.length()-1; i >= 0; i--){
            reverse.append(input.charAt(i));
        }
        String reverseStr = ""+reverse;
        if(input.equals(reverseStr)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
