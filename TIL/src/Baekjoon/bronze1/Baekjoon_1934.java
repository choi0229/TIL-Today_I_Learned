package Baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Baekjoon_1934 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            Map<Integer,Integer> map = new TreeMap<>();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int multiply = a * b;

            for(int j = 1; j <= a; j++){
                int multiply2 = b * j;
                if(multiply % multiply2==0){
                    map.put(multiply2, map.getOrDefault(multiply2, 0)+1);
                }
            }
            for(int j = 1; j <= b; j++){
                int multiply2 = a * j;
                if(multiply % multiply2==0){
                    map.put(multiply2, map.getOrDefault(multiply2, 0)+1);
                }
            }
            for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
                int result = multiply % entry.getKey();
                if(result==0 &&entry.getValue()>1){
                    sb.append(entry.getKey()).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
