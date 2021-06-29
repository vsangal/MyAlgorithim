package problems;

import java.util.HashMap;

public class FindsubArrayWithGivenSum {

	public static void main(String[] args) {
		
		 int[] arr = {3, 4, 20, 5, 10, 5}; 
	        int n = arr.length; 
	        int sum = 25; 

	        subArraySum(arr, n, sum); 

	}
	
	static void subArraySum(int arr[], int n, int sum) 
    { 
        int curr_sum; 
        boolean found = false;
  
        // Pick a starting point 
        for (int i = 0; i < arr.length; i++) { 
            
        	curr_sum = arr[i]; 
            
            for (int j = i + 1; j < arr.length; j++) {
            	
            	curr_sum = curr_sum + arr[j];
            	
            	if (curr_sum == sum){
            		found = true;
            		System.out.println("Sum is between " + i + " and " + j);
            	}
            	
            	if (curr_sum > sum) {
            		break;
            	}
            }
        } 
        if (!found) {
        	System.out.println("Sum not found");
        }
    } 
} 
