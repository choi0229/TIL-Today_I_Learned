package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_1181 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        String[][] sarr = new String[n][2];

        for(int i = 0; i < n; i++){
            String s1 = bf.readLine();
            sarr[i][0] = String.valueOf(s1.length());
            sarr[i][1] = s1;
        }
        Arrays.sort(sarr, (arr1, arr2) -> {
            int len1 = Integer.parseInt(arr1[0]);
            int len2 = Integer.parseInt(arr2[0]);
            if(len1==len2){
                return arr1[1].compareTo(arr2[1]);
            }else{
                return len1-len2;
            }
        });
        StringBuffer sb = new StringBuffer();
        sb.append(sarr[0][1]).append("\n");
        for(int i = 1; i < n; i++){
            if(!sarr[i][1].equals(sarr[i-1][1])){
                 sb.append(sarr[i][1]).append("\n");
            }            
        }
        System.out.println(sb);
    }
}
