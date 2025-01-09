package silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_2563 {
	public static void main(String[] args)throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(bf.readLine());

        int[][] arr = new int[100][100];

        for(int k = 0; k<input; k++){
            String[] arrStr = bf.readLine().split(" ");
            int a = Integer.parseInt(arrStr[0]);
            int b = Integer.parseInt(arrStr[1]);
    
            for(int i = a; i < a+10; i++){
                for(int j = b; j< b+10;j++){
                    arr[i][j] += 1;
                }
            }
        }

        int count = 0;
        int result = input*100;

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(arr[i][j]>1){
                    count+=arr[i][j]-1;
                }
            }
        }

        System.out.print(result-count);
    }
}
