package problems;

import java.util.*;
import java.io.*;

public class FindPair {

		public static void main (String[] args) {
			Scanner in = new Scanner(System.in);
			int T  = in.nextInt();
			
			
			while(T-->0){
			    
			int N =in.nextInt();
			int[] a = new int[N]; 
			for(int i = 0 ; i<N;i++) a[i] = in.nextInt();
			 int count = 0;
			 
			 for(int m=0;m<N-1;m++){
			     for(int n = m+1 ;n<N;n++){
			         if((a[m]+a[n])%3==0) count++;
			     }
			 }
			         for(int j = 0;j<N-2;j++){
			             for(int k=j+1;k<N-1;k++){
			                 for(int q = k+1;q<N;q++){
			                     if((a[j]+a[k]+a[q])%3==0)
			                     count++;
			                     
			                 }
			                 
			             }
			             
			         }
			         
			         System.out.println(count);
			         
			     
			     
			 }
			}
	}
