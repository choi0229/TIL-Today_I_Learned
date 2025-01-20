package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2231 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String m = bf.readLine();
        int n = Integer.parseInt(m);
        int a = 1;
        int result = 0;
        
        for(int i = 1; i <= n; i++){
            int n1 = i%10;
            int n2 = (i/10)%10;
            int n3 = (i/100)%10; 
            int n4 = (i/1000)%10;
            int n5 = (i/10000)%10;
            int n6 = (i/100000)%10;
            int n7 = i/1000000;
            
            result = n1+ n2+ n3+ n4+ n5+ n6+ n7+ i;
            if(n==result){
                result = i;
                a = 0;
                break;
            }
        }
        if(a==0){
            System.out.println(result);
        }else{
            System.out.println(0);
        }
        
    }
}
