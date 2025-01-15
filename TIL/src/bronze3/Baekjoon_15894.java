package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_15894 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long input = Long.parseLong(bf.readLine());

        System.out.println(input*4);
    }
}
