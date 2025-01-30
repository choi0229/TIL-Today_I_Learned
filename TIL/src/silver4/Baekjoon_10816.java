package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 숫자 카드2
public class Baekjoon_10816 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        for(int i = 0; i < n ; i ++){
            String s1 = st.nextToken();
            int a = Integer.parseInt(s1);
            map.put(s1, map.getOrDefault(s1, 0)+1);
        }
        
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        
        for(int i = 0; i < m ; i++){
            sb.append(map.getOrDefault(st2.nextToken(), 0)).append(" ");
        }
        System.out.println(sb);
    }
}
