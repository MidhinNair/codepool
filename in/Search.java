package scalar.in;

import java.util.Scanner;

public class Search {
	public static void main(String [] args) {
		String A = "1101", B="100";
        
        System.out.print(addBinary(A, B));
    }

		   static String addBinary(String A, String B) {
			   StringBuilder bin =new StringBuilder("");
			   
		        int s=0;
		        int i=A.length()-1,j=B.length()-1;
		        
		        while(i>=0||j>=0||s==1){
		            s+=((i >=0)? A.charAt(i) - '0':0);
		              s+=((j >=0)?A.charAt(j)- '0':0);
		              bin.append((char)(s % 2 + '0'));
		              s /=2;
		              i++; j--;
		        }
		        int st=bin.length()-1;
		        while(st>0&&bin.charAt(st)=='0'){ st--;}
		        if(st!=bin.length()-1){ bin.delete(st+1,bin.length());}

		    
		        return bin.reverse().toString();
		    }
		}

