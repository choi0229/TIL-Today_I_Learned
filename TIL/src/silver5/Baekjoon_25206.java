package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_25206 {
	public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double count = 0;
        double sum = 0;
        double sum2 = 0;
        for(int i = 0; i < 20; i++){
            String[] arrStr = bf.readLine().split(" ");
            double a = Double.parseDouble(arrStr[1]);
            double b = 0;
            if(arrStr[2].equals("A+")){
                b = 4.5;
            }else if(arrStr[2].equals("A0")){
                b = 4.0;
            }else if(arrStr[2].equals("B+")){
                b = 3.5;
            }else if(arrStr[2].equals("B0")){
                b = 3.0;
            }else if(arrStr[2].equals("C+")){
                b = 2.5;
            }else if(arrStr[2].equals("C0")){
                b = 2.0;
            }else if(arrStr[2].equals("D+")){
                b = 1.5;
            }else if(arrStr[2].equals("D0")){
                b = 1.0;
            }else if(arrStr[2].equals("F")){
                b = 0;
            }else if(arrStr[2].equals("P")){
                b = 0;
                a = 0;
            }
            sum2 += a;
            sum += a * b;
        }

        double result = 0;
        result = sum/(sum2);

        System.out.println(String.format("%10.6f",result));
    }
}
