package scalar.in;

import java.util.Scanner;

public class Remove {
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] A= new int [n+2];
        for(int i=1;i<=n;i++){
            A[i]=sc.nextInt();//actual array
        }
        int p = sc.nextInt();//position
       
        n++;
        for(int i=p ; i<n ; i++){
            A[i]=A[i+1];
            System.out.print(A[i]+" ");
    
           
        }
        System.out.println();
        
            for(int i=1;i<n-1;i++ ){
            System.out.print(A[i]+" ");}
    }

}
