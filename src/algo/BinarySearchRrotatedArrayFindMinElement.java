package algo;/*
 * This class takes a rotated array and finds the index of min value
 */


public class BinarySearchRrotatedArrayFindMinElement {
	 
    public int binarySearch(int[] inputArr) {
         
        int start = 0;
        int end = inputArr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
           
        	if (inputArr[end] < inputArr[start]) {
        		return end;
        	}

            if (inputArr[mid] > inputArr[start]) {
               start = mid;
               mid = (start + end) / 2;
            }
            if (inputArr[mid] < inputArr[start]) {
            	return mid;
            }
           
        }
        return -1;
    }
  
    public static void main(String[] args) {
         
    	BinarySearchRrotatedArrayFindMinElement mbs = new BinarySearchRrotatedArrayFindMinElement();
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 1};
        System.out.println("Position on min is : "+mbs.binarySearch(arr));
    }
}