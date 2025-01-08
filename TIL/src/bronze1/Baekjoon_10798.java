package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10798 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[][] arr = new String[5][15]; 
        for(int i = 0; i < 5; i++){
            String str = bf.readLine();
            for(int j = 0; j < str.length(); j++){
                arr[i][j] = ""+str.charAt(j);
            }
        }

        for(int i = 0; i < 15; i++){
            for(int j =0; j<5;j++){
                if(arr[j][i]==null){
                    System.out.print("");
                }else{
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
