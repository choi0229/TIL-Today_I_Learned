package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_1620 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] s1 = bf.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);

        String[] arr = new String[n];
        Map<String, Integer> map = new HashMap<>();

        for(int i = 1; i <= n ; i++){
            String st = bf.readLine();
            arr[i-1] = st;
            map.put(st, i);
        }

        for(int i = 0; i < m ; i++){
            String st = bf.readLine();
            char c = st.charAt(0);
            if(c>'9'){
                System.out.println(map.get(st));
            }else{
                int a = Integer.parseInt(st);
                System.out.println(arr[a-1]);
            }
            
        }
    }
}
