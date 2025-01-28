package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 숫자 카드
public class Baekjoon_10815 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] arrStr1 = bf.readLine().split(" ");

        int m = Integer.parseInt(bf.readLine());
        String[] arrStr2 = bf.readLine().split(" ");

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            map.put(arrStr2[i], 0);
        }

        for(int i = 0; i < n; i++){
            if(map.containsKey(arrStr1[i])){
                map.put(arrStr1[i], 1);
            }
        }

        for(int i = 0; i < m; i++){
            System.out.print(map.get(arrStr2[i])+" ");
        }
    }
}
