package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* given an integer array and an integer k, find a number of sub arrays in which all elements are less than k */
/* NOT ABLE TO COMPLETE */

public class SubArrayFB {

	public static void main (String[] argv) {
		
		int[] intInputs = {3,4,7,1,12,5,10,6,8};

		int k = 5;
				
		subSet(intInputs, k);
		
	}
	
	public static void subSet(int[] intInputs, int k) {
	
		HashMap<Integer, ArrayList<Integer>> map = new HashMap <Integer, ArrayList<Integer>>();
		
		int[] sortedInputs = sortInteger(intInputs);
		
		for (int sortedInput : sortedInputs) {
			
			if (sortedInput < k) {
				
				//System.out.print(sortedInput);
				//System.out.println(",");
				
				for (int subSortedInput : sortedInputs) {
					
					if (subSortedInput < k) {
						System.out.print(sortedInput); 
						System.out.print(",");
						System.out.print(subSortedInput); 
						System.out.println("");					}
				}
				
			}
		}
	}
	
	public static int[] sortInteger(int[] intInputs) 
    { 
       
		// sort tempArray 
        Arrays.sort(intInputs); 
          
        // return new sorted string 
        return  intInputs;
    } 	
	
}
