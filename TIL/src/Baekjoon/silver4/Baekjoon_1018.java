package Baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1018 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arrStr = bf.readLine().split(" ");
        int n = Integer.parseInt(arrStr[0]);
        int m = Integer.parseInt(arrStr[1]);

        char[][] arr = new char[n][m];

        for(int i = 0; i < n; i++){
            String input = bf.readLine();
            for(int j = 0; j < m; j++){
                arr[i][j] = input.charAt(j);
            }
        }

        int min = 64;
        for(int i = 0; i <= n-8; i++){
            for(int j = 0; j <= m-8; j++){
                int bCount = 0;
                int wCount = 0;
                for(int x = i; x < i+8; x++){
                   
                    for(int y = j; y < j+8; y++){
                        char bPat = ((x+y)%2==0)?'B':'W';
                        char wPat = ((x+y)%2==0)?'W':'B';
                        if(bPat!=arr[x][y]){
                            bCount++;
                        }
                        if(wPat!=arr[x][y]){
                            wCount++;
                        }
                    }
                    
                }
                if(min>bCount){
                    min = bCount;
                }
                if(min>wCount){
                    min = wCount;
                }
                
            }
        }

        System.out.println(min);                                                                                                                           
    }
}
