package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 나이순 정렬
public class Baekjoon_10814 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[][] arr = new String[n][2];
        for(int i = 0; i < n; i++){
            String[] arrStr = bf.readLine().split(" ");
            arr[i][0] = arrStr[0];
            arr[i][1] = arrStr[1];
        }

        Arrays.sort(arr, (arr1, arr2) -> {
            int num1 = Integer.parseInt(arr1[0]);
            int num2 = Integer.parseInt(arr2[0]);
            return num1-num2;
        });

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n;i++){
            sb.append(arr[i][0]+" "+arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
