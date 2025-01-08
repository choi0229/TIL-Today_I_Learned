package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2738 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arrStr = bf.readLine().split(" ");

        int n = Integer.parseInt(arrStr[0]);
        int m = Integer.parseInt(arrStr[1]);
        int[][] arr = new int[n][m];
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i = 0; i < n; i++){
            String[] arrStr1 = bf.readLine().split(" ");
            for(int k = 0; k < m; k++){
                arr[i][k] = Integer.parseInt(arrStr1[k]);
            }        
        }

        for(int i = 0; i < n; i++){
            String[] arrStr2 = bf.readLine().split(" ");
            for(int k = 0; k < m; k++){
                arr[i][k] += Integer.parseInt(arrStr2[k]);
                System.out.print(arr[i][k]);
                if (k < m - 1) {
                    System.out.print(" ");
                };
            }
            System.out.println();
        }
    }
}
