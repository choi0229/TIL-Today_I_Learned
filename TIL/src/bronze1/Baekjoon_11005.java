package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11005 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = bf.readLine().split(" ");

        long n = Long.parseLong(arr[0]);
        int input2 = Integer.parseInt(arr[1]);

        String result = Long.toString(n,input2).toUpperCase();

        System.out.println(result);
    }
}
