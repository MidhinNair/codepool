package scalar.in.vv;

import java.util.*;

public class Prime  {
    public static void main(String[] args) {
    	  
    
   Scanner sc =new Scanner(System.in);

        int n = sc. nextInt();

        for(int i=2;i<=n;i++){
        	
        	int notprime=0;
        	for(int j=2;j<=Math.sqrt(i);j++)
        	{
        		if(i%j!=0) {
        			
        			continue;
        		}
        		else
        		{
        			
        			notprime=1;
        			break;
        		}
        	}
        	if(notprime==0) {
        		
        		System.out.println(i);
        	}}
    }}
        	