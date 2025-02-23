package Baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9461 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            int m = Integer.parseInt(bf.readLine());
            long[] dp = new long[m+1];

            if(m==1){
                sb.append(1).append("\n");
                continue;
            }
            if(m==2){
                sb.append(1).append("\n");
                continue;
            }
            if(m==3){
                sb.append(1).append("\n");
                continue;
            }

            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;

            for(int j = 4; j <= m; j++){
                dp[j] = dp[j-2] + dp[j-3];
            }
            sb.append(dp[m]).append("\n");
        }
        System.out.println(sb);
    }
}
