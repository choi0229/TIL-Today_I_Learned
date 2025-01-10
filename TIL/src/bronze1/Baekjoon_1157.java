package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1157 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bf.readLine().toUpperCase();;
        int[] arr = new int[26];
        for(int i = 0; i < s1.length(); i++){
            arr[s1.charAt(i)-'A']++;
        }
        int max = 0;
        int result = 0;
        for(int i = 0; i < 26; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        };

        int count = 0;
        for(int i = 0; i < 26; i++){
            if(arr[i]==max){
                count++;
                result = i;
            }
        }
        if(count>1){
            System.out.println("?");
        }else{
            System.out.println((char)(result+'A'));
        }
    }
}
