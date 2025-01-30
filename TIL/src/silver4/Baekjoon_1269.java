package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 대칭 차집합
public class Baekjoon_1269 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        Set<String> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(st2.nextToken());
        }
        StringTokenizer st3 = new StringTokenizer(bf.readLine());
        for(int i = 0; i < m; i++){
            String num = st3.nextToken();
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        System.out.println(set.size());
    }
}
