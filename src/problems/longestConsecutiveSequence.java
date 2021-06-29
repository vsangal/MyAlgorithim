package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* Longest consecutive Subsequence */
/* This code only works if the array is sorted in ascending order */ 
/* Code only works for test 3 */

public class longestConsecutiveSequence {
	
    static int sequence = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
    
	public static void main(String[] args) {
        //int nums[] = {1, 2, 4, 12, 8, 10, 6, 14, 9, 5, 13, 3, 11, 7, 15};   //-- test 1
        //int nums[]  = {1, 4, 8, 5, 2, 9, 7, 19, 10, 11}; // -- test 2
        int nums[] = {1, 2, 4, 5, 6, 7, 9}; // -- test 3 
        int longestStreak = 0;
        
        longestStreak = longestConsecutive(nums);
        System.out.println("Original array length: "+nums.length);
        
        System.out.println("Longest consecutive sequence is : "+ longestStreak);
    }
	
	public static int longestConsecutive(int[] nums) {
        int longestStreak = 0;

        for (int num : nums) {
            int currentNum = num;
            int currentStreak = 1;

            while (arrayContains(nums, currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }

        return longestStreak;
    }
	 
	private static boolean arrayContains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }

        return false;
    }
}