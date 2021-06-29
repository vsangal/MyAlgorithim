package algo;

//
//Java program for implementation of Insertion Sort
class SortInsertion
{
 /*Function to sort array using insertion sort*/
 void sort(int arr[])
 {
     int len = arr.length;
     printArray(arr);
     for (int i=1; i<len; ++i)
     {
         int key = arr[i];
         int j = i-1;
         /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
         while (j>=0 && arr[j] > key)
         {
        	 System.out.println(" J is = " + j + " arr[j] = " + arr[j] + " key = " +  key);
             arr[j+1] = arr[j];
             System.out.println(" J is = " + j + " arr[j+1] = " + arr[j+1] + " key = " +  key);
             j = j-1;
             System.out.println(" J = " + j);
             printArray(arr);
             
         }
         arr[j+1] = key;
         printArray(arr);
     }
 }

 /* A utility function to print array of size n*/
 static void printArray(int arr[])
 {
     int n = arr.length;
     for (int i=0; i<n; ++i)
         System.out.print(arr[i] + " ");

     System.out.println();
 }

 // Driver method
 public static void main(String args[])
 {        
     int arr[] = {9, 8, 5, 2, 1};
     SortInsertion ob = new SortInsertion();        
     ob.sort(arr);
      
     printArray(arr);
 }
} 