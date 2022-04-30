package scalar.in.vv;

import java.util.Scanner;

public class PALIENDOME {
    public static void main(String[] args) {
        
        
   Scanner sc =new Scanner(System.in);

        int n = sc. nextInt();
        
        
        for(int j=2;j<=Math.sqrt(n);j++)
        {
        if(n%j!=0) {
       
        	System.out.println("yes");
        }
        else
        {
        	System.out.println("no");
        
        }
        }
        if(n==0) {
       
        	System.out.println("no");
        }}
    }
       