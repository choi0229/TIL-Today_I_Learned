package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_11650 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++){
            String[] arrStr = bf.readLine().split(" ");
            arr[i][0] = Integer.parseInt(arrStr[0]);
            arr[i][1] = Integer.parseInt(arrStr[1]);
        }

        Arrays.sort(arr, (arr1, arr2) -> {
            if(arr1[0]==arr2[0]){
                return arr1[1]-arr2[1];
            }else{
                return arr1[0]-arr2[0];
            }
        });

        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < n; i++){
            sb.append(arr[i][0]+" "+arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
