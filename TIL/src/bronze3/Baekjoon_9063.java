package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_9063 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++){
            String[] arrStr = bf.readLine().split(" ");
            int a = Integer.parseInt(arrStr[0]);
            int b = Integer.parseInt(arrStr[1]);
            arr1[i] = a;
            arr2[i] = b;
        }

        int xMin = Arrays.stream(arr1).min().getAsInt();
        int xMax = Arrays.stream(arr1).max().getAsInt();
        int yMin = Arrays.stream(arr2).min().getAsInt();
        int yMax = Arrays.stream(arr2).max().getAsInt();

        int result = (xMax-xMin)*(yMax-yMin);

        System.out.println(result);
    }
}
