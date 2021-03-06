package algo;

import java.util.Arrays;

/* Merge two sorted array */
/* For merge sort example. Just divide the given array into 2 halves 
 * and then use this code
 *      int midlengthOfArray = array.length()/2
 *      int firstLen = midlengthOfArray -1; 
        int secondArrayLen = array.length() - midlengthOfArray -1 ; 
  
        // Create temp arrays 
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
  
        //Copy data to temp arrays
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1 + j]; 
  

 */
public class SortMerge {

	public static void main(String[] args) {

		int[] arr1 = { 4, 6, 8, 10, 12 };
		int[] arr2 = { 3, 5, 7, 11, 13, 15, 17 };
		int[] mergedArray = new int[arr1.length + arr2.length];

		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr2 = " + Arrays.toString(arr2));
		mergedArray = mergeArray(arr1, arr2);
		
		System.out.print("Merged Arrray = " + Arrays.toString(mergedArray));
		
	}

	static int[] mergeArray(int[] arr1, int[] arr2) {

		int[] sortedArray = new int[arr1.length + arr2.length];
		int k = -1;
		int startIndex = 0;
		int i = 0;
		int j = startIndex;

		for (i = 0; i < arr1.length; i++) {

			for (j = startIndex; j < arr2.length; j++) {
				
				k++;

				if (arr1[i] > arr2[j]) {
					sortedArray[k] = arr2[j];
					startIndex++;
				} else {
					sortedArray[k] = arr1[i];
					break;
				}
			}
		}
		
        /* Insert any remaining elements of arrays */
		/* Check which array is shorter than the other one */
		if (i < j){
			
			for (j=startIndex; j < arr1.length; j++) {
				k++;
				sortedArray[k] = arr2[j];
			}

		}
		else{
		
			for (i=startIndex; i < arr2.length; i++) {
				k++;
			 	sortedArray[k] = arr2[i];
			}
		
		}
		
		return sortedArray;
	}
}
