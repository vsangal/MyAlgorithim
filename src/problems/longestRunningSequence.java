package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* Longest Increasing Subsequence */

public class longestRunningSequence {
	
    static int sequence = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
    
	public static void main(String[] args) {
        //int nums[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};  
        //int nums[]  = {1, 4, 8, 5, 2, 9, 7, 19, 10, 11};
        int nums[] = {1, 2, 8, 4, 5, 6, 7, 9 };
        int longestSequence = 0;
        
        longestSequence = longestConsecutive(nums);
        System.out.println("Original array length: "+ nums.length);
        
        System.out.println("Longest sequence is : "+ longestSequence);
    }
	
	 public static int longestConsecutive(int[] nums) {
		 
	        int longestStreak = 0;
	        //int nextSequenceNum = 0;
	        HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();

	        for (int i=0; i<nums.length; i ++ ) {
	            int currentNum = nums[i];
	            int currentStreak = 1;
	            int startIndx = 1; // Compare the next value in an array

	            for (int j= 0; j <nums.length; j++) {
	            	
	            	if (startIndx != nums.length ) {
		            	resultMap = arrayContains(nums, currentNum, startIndx);
		            	
		            	//System.out.println("resultMap.get(0) " + resultMap.get(0));
		            	//System.out.println("nums[resultMap.get(0)] " + nums[resultMap.get(0)]);
		            	
		            	if (nums[resultMap.get(0)] != currentNum) {
		            		currentStreak += 1;
		            		currentNum = nums[resultMap.get(0)];
		            		System.out.println("currentNum == " +  currentNum + "currentStreak == " + currentStreak );
		            		startIndx = resultMap.get(0)+1;
		            		System.out.println("startIndx == " +  startIndx );
		            	}else {
		            		break;
		            	}
	            	}
	           
	        	}

	            /* while (arrayContains(nums, currentNum, startIndx)) {
                currentNum = 1;
                currentStreak += 1;
                startIndx +=1;
            	}*/
	            
	            longestStreak = Math.max(longestStreak, currentStreak);
	        }
	        return longestStreak;
	    }
	 
	 /* find next greater number from starting point */
	 private static HashMap<Integer, Integer> arrayContains(int[] arr, int num, Integer startIndx) {
		
		 HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		 Integer arrInt = 0; 
		 boolean found = false;
		 
		 System.out.println("startIndx = " +  startIndx + " arr.length =  " + arr.length);

			 for (Integer i = startIndx; i < arr.length; i++) {
				 System.out.println(" within for loop " + arr[i]);  
				 
				 //if (num < arr[i] || num > arr[i-1]) 
				
				if (arr[i] >= num) {
		            System.out.println("i == " + i);	
					arrInt = arr[i] ;
		            resultMap.put(0,i);
		            resultMap.put(i, arrInt);
		            found = true;
		            return resultMap;
	
		            }
		        }
			 	if (!found) { 
			 		arrInt = num;
			 		resultMap.put(0,startIndx);
			 		resultMap.put(startIndx, arrInt);
			 	}
		 return resultMap;
	        
	    }
}

