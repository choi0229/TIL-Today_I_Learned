package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_19532 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arrStr = bf.readLine().split(" ");
        int a = Integer.parseInt(arrStr[0]);
        int b = Integer.parseInt(arrStr[1]);
        int c = Integer.parseInt(arrStr[2]);
        int d = Integer.parseInt(arrStr[3]);
        int e = Integer.parseInt(arrStr[4]);
        int f = Integer.parseInt(arrStr[5]);

        int x = 0;
        int y = 0;

        for(int i = -999; i <= 999; i++){
            for(int j = -999; j <= 999; j++){
                if(((a*i)+(b*j)==c)&&((d*i)+(e*j)==f)){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.println(x+" "+y);
    }
}
