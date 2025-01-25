package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2839 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int result = n;

        for(int i = 0; i < n; i++){
            int a = 5 * i;
            for(int j = 0; j < n; j++){
                int b = a;
                b += 3 * j;
                if(b == n){
                    if(i+j < result){
                        result = i+j;
                    }
                }else if(b > n){
                    j = n;
                }
            }
        }
        if(result == n){
            System.out.println(-1);
        }else{
            System.out.println(result);
        }
        
    }
}
