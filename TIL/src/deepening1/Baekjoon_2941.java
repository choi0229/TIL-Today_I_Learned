package deepening1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2941 {
	public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        int count = 0;
        int len = input.length();

        for(int i = 0; i < len; i++){
            char ch = input.charAt(i);

            if(ch=='c' && i < len-1 ){
                if(input.charAt(i+1)=='='){
                    i++;
                }else if(input.charAt(i+1)=='-'){
                    i++;
                }
            }

            else if(ch == 'd'  && i < len-1) {
        		if(i < input.length() - 1) {
        			if(input.charAt(i + 1) == 'z') {
        				if(i < input.length() - 2) {
        					if(input.charAt(i + 2) == '=') {	// dz= 일 경우
        						i += 2;
        					}
        				}
        			}
                
        			else if(input.charAt(i + 1) == '-') {	// d- 일 경우
        				i++;
        			}
        		}
        	}
            
        	else if(ch == 'l' && i < len-1) {
        		if(i < input.length() - 1) {
        			if(input.charAt(i + 1) == 'j') {	// lj 일 경우
        				i++;
        			}
        		}
        	}
            
        	else if(ch == 'n' && i < len-1) {
        		if(i < input.length() - 1) {
        			if(input.charAt(i + 1) == 'j') {	// nj 일 경우
        				i++;
        			}
        		}
        	}
         
        	else if(ch == 's' && i < len-1) {
        		if(i < input.length() - 1) {
        			if(input.charAt(i + 1) == '=') {	// s= 일 경우
        				i++;
        			}
        		}
            }
         
        	else if(ch == 'z' && i < len-1) {
        		if(i < input.length() - 1) {
        			if(input.charAt(i + 1) == '=') {	// z= 일 경우
        				i++;
        			}
        		}
        	}

            count++;
        }
        System.out.println(count);
    }

}
