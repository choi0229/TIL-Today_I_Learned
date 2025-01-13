package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2720 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int input1 = Integer.parseInt(bf.readLine());

        int[] result = new int[4];

        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        for(int i = 0; i< input1; i++){
            int input2 = Integer.parseInt(bf.readLine());
            result[0] = input2/q;
            input2 = input2 % q;
            result[1] = input2/d;
            input2 = input2%d;
            result[2] = input2/n;
            input2 = input2%n;
            result[3] = input2/p;
            System.out.println(result[0]+" "+result[1]+" "+result[2]+" "+result[3]);
        }
    }
}
