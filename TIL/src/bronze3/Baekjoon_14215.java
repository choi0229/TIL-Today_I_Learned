package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_14215 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arrStr = bf.readLine().split(" ");
        int[] arr = new int[3];
        int maxIndex = 0;
        int sum = 0;
        for(int i = 0 ; i < 3 ; i++){
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        int max = Arrays.stream(arr).max().getAsInt();

        for(int i = 0; i < 3; i++){
            if(max==arr[i]){
                maxIndex = i;
            }
        }

        if(maxIndex==0){
            sum = arr[1]+arr[2];
        }else if(maxIndex==1){
            sum = arr[0]+arr[2];
        }else{
            sum = arr[0]+arr[1];
        }

        int result = 0;
        if(sum>max){
            System.out.println(sum+max);
        }else{
            for(int i = 100; i > 0; i--){
                if(i<sum){
                    result=i;
                    break;
                }
            }
            System.out.println(sum+result);
        }
    }
}
