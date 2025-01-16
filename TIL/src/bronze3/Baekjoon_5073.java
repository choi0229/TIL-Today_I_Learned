package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_5073 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];

        String[] arrStr = bf.readLine().split(" ");
            arr[0] = Integer.parseInt(arrStr[0]);
            arr[1] = Integer.parseInt(arrStr[1]);
            arr[2] = Integer.parseInt(arrStr[2]);
        
        while(arr[0]!=0 && arr[1] != 0 && arr[2] !=0){

            int max = Arrays.stream(arr).max().getAsInt();
            int maxIndex = 0;
            int num = 0;

            for(int i = 0; i < 3; i++){
                if(max==arr[i]){
                    maxIndex = i;
                }
            }
            if(maxIndex==0){
                 num = arr[1]+arr[2];   
            }else if(maxIndex==1){
                num = arr[0]+arr[2];
            }else{
                num = arr[0]+arr[1];
            }
            if(max>=num){
                System.out.println("Invalid");
            }else{
                if((arr[0]==arr[1])&&(arr[0]==arr[2])&&(arr[1]==arr[2])){
                     System.out.println("Equilateral");
                }else if((arr[1]==arr[2])||(arr[0]==arr[1])||(arr[0]==arr[2])){
                     System.out.println("Isosceles");
                }else{
                     System.out.println("Scalene");
                }
            }
            
            arrStr = bf.readLine().split(" ");
            arr[0] = Integer.parseInt(arrStr[0]);
            arr[1] = Integer.parseInt(arrStr[1]);
            arr[2] = Integer.parseInt(arrStr[2]);
        }
    }
}
