package scalar.in.vv;


import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int l = sc.nextInt();
            int[] A=new int [l];
            for(int i=0;i<l;i++) {
            	A[i]=sc.nextInt();
            }
            solve(A);           
            
			
		

                }
    public static void solve(int[] A) {

        int n= A.length;
        int pse [] = new int[n];
        int pso [] = new int [n];
        pse[0]=A[0];
        pso[0]=0;
        for(int i=1;i<n;i++){
            if(i%2==0){
            pse[i]= pse[i-1]+A[i];
            }
            else{
                pse[i]=pse[i-1];

            }
            if(i%2==0){
            pso[i]=pso[i-1];
            }
            else{
            pso[i]= pso[i-1]+A[i];        
            }
            // rvrn arry odd array prifix sum is ready!...
        }
        int count=0;
        for(int i=0;i<n;i++){
        	int se,so;
        	if(i==0){
        		se = (pso[n-1]-pso[i]);
                so = (pse[n-1]-pse[i]);}
        	else {
            se = pse[i-1]+(pso[n-1]-pso[i]);
            so = pso[i-1]+(pse[n-1]-pse[i]);
            
        	}if(se==so)
            count++;
        }

    
        
     	System.out.println(count);
        
        

        }

    }

