package problems;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		largestSum(arr);

	}
	
	static void largestSum(int[] arr) {
		
		int sum = 0;
		
		for(int i =0; i<arr.length; i++) {
			
			for(int j=i+1; j < arr.length; j++) {
				
				sum = Math.max(sum, arr[i] + arr[j]);
				//OR
				//if (sum < arr[i] + arr[j]) {
				//	sum = arr[i] + arr[j];
				//}
			}
		}
		
		System.out.println("Max sum is = " + sum);
		
	}

}
