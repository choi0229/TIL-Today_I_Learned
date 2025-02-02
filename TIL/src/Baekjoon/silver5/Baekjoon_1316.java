package Baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1316 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(bf.readLine());

        int result = 0;
        
        for(int i = 0 ; i< input ; i++){
            String s1 = bf.readLine();
            int[] arr = new int[26];
            int count = 0;
            for(int j = 0; j< s1.length(); j++){
                if(j>0){
                    if(s1.charAt(j)!=s1.charAt(j-1)){
                        arr[s1.charAt(j)-'a']++;
                    }
                }else{
                    arr[s1.charAt(j)-'a']++;
                }
            }
            for(int k = 0; k < 26; k++){
                if(arr[k]>1){
                    count++;
                }
            }

            if(count>=1){
                result++;
            }
        }
        System.out.println(input-result);
    }
}
