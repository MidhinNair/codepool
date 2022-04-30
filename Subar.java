package scalar.in;

import java.util.Scanner;

public class Subar {
	public static void main(String [] argss) {
		int n=3;
		int a [] = {1,2,3};
		
		// print all subarrays
		
		subarray(a,n);
		//subarraysum(a,n);
		//subarraysumofi(a,n);
		//maxsubarraysumcarryf(a,n);
		//maxsumofallsub(a,n);
		subarraysumt(a,n);
		sumofallsubarray(a,n);

		//subarraysumcarryf(a,n);

}

	    static void subarray(int[] a, int n) {
         for(int start=0;start<n;start++) {//row
			
			for(int end=start;end<n;end++) {
				for(int k=start;k<=end;k++) {
				
			System.out.print(a[k]);
				}
				System.out.print(" ");
			}
			System.out.println();
			}
	}
	    static void subarraysum(int[] a, int n) {
	         for(int start=0;start<n;start++) {//row
				
				for(int end=start;end<n;end++) {
					int sum=0;
					for(int k=start;k<=end;k++) {
					sum+=a[k];
					}
					
					System.out.println(sum);

				}
				
				}
		}
	    
	    
	    static void subarraysumofi(int[] a, int n) {
	    	 Scanner sc = new Scanner(System.in);
	        	System.out.println("enter the index of i for subarys till n");
	        	int i= sc.nextInt();
				 
	    	for(int start=0;start<n;start++) {//row
	        	
				for(int end=i;end<n;end++) {
					int sum=0;
					for(int k=start;k<=end;k++) {
					sum+=a[k];
					}
					
					System.out.println(sum);

				}
				
				}
	    	sc.close();
		}
	    
	    
	    static void subarraysumcarryf(int[] a, int n) {
	         for(int start=0;start<n;start++) {//row
				int sum=0;
				for(int end=start;end<n;end++) {
					
					
					sum+=a[end];
					}
					
					System.out.println(sum);

				}
				
				}
		
	    
	    static void maxsubarraysumcarryf(int[] a, int n) {
	    	int maxsum= a[0];
	         for(int start=0;start<n;start++) {//row
				int sum=0;
				for(int end=start;end<n;end++) {
					
					
					sum+=a[end];
					if(maxsum<sum)maxsum=sum;
					}
					
					

				}
	         System.out.println("max sum of subarray sums");
	         System.out.println(maxsum);
				}
		
	    static void maxsumofallsub(int[] a, int n) {
	    	int sum=0;
	    	int tsum=0;
	    	for(int i=0;i<n;i++) {
	    		sum+=a[i];
	    		if(sum<0)sum=0;
	    		tsum=Math.max(tsum, sum);   			
	    	}
	    	System.out.println("max sum using kadanes algo");
	    	System.out.println(tsum);
	    }
	    
	    static void subarraysumt(int[] a, int n) {
	    	int sum=0;
	         for(int start=0;start<n;start++) {//row
				
				for(int end=start;end<n;end++) {
					
					for(int k=start;k<=end;k++) {
					sum+=a[k];
					}
				
				}}
	         System.out.println("subarry sum of all subarray of tc(n*3)");
				System.out.println(sum);
				
		}
	    static void sumofallsubarray(int[] a, int n) {
	    	int sum=0;
	    	for(int i=0;i<n;i++) {
	    		
	    		int s=i+1;
	    		int e =n-i;
	    		int countri= s*e*a[i];
	    		sum+=countri;
	    	}
	    	System.out.println("subarry sum of all subarrays by countribution method");
	    	System.out.println(sum);
	    }
	    
	}
		
		
	
