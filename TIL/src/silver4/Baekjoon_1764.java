package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// 듣보잡
public class Baekjoon_1764 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n+m ; i++){
            String s1 = bf.readLine();
            map.put(s1 ,  map.getOrDefault(s1, 0)+1);
        }
        List<String> list= new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        StringBuffer sb = new StringBuffer();
        sb.append(list.size()).append("\n");
        for(String l : list){
            sb.append(l).append("\n");
        }
        System.out.println(sb);
        
    }
}
