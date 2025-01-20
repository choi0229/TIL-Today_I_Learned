package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Baekjoon_2798 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arrStr1 = bf.readLine().split(" ");
        String[] arrStr2 = bf.readLine().split(" ");

        int n = Integer.parseInt(arrStr1[0]);
        int m = Integer.parseInt(arrStr1[1]);
        int result = 0;

        Integer[] arr = new Integer[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(arrStr2[i]);
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    int a = arr[i]+arr[j]+arr[k];
                    if(m>=a && a>result){
                        result = a;
                        if(a==result){
                            break;
                        }
                    }
                    
                }
            }
        }
        System.out.println(result);
    }
}
