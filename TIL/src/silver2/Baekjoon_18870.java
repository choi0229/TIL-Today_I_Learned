package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Baekjoon_18870 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] arrStr = bf.readLine().split(" ");
        int[] arr = new int[n];
        int[] arr2 = new int[n];


        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(arrStr[i]);
            arr2[i] = Integer.parseInt(arrStr[i]);
        }

        Arrays.sort(arr2);

        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for(int value : arr2){
            if(!map.containsKey(value)){
                map.put(value, index++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int value : arr){
            sb.append(map.get(value)).append(" ");
        }
        System.out.println(sb);

    }
}
