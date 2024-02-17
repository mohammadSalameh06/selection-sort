
package SelectionMerge;

public class selectionSort {
	
	    void sort(int arr[])
	    {
	        int len = arr.length;
	 
	        // One by one move boundary of unsorted sub array
	        //(n-1)==>to ensure that the last element of the array is not included in the iteration.
	        for (int i = 0; i < len-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int min_index = i;
	            for (int j = i+1; j < len; j++)
	                if (arr[j] < arr[min_index])
	                	min_index = j;
	 
	            // Swap the found minimum element with the first
	            // element
	            int temp = arr[min_index];
	            arr[min_index] = arr[i];
	            arr[i] = temp;
	        }
	    }
	 
	    // Prints the array
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 
	    // Driver code to test above
	    public static void main(String args[])
	    {
	        selectionSort ob = new selectionSort();
	        System.out.println("\t \t>Selection Sort<");

	        int arr[] = {64,25,12,22,11,66,65,67,80,123,321};
	        System.out.println(">UnSorted array");
	        
	        ob.printArray(arr);
	        System.out.println("============Sorting=================");
	        ob.sort(arr);
	        System.out.println(">Sorted array");
	        
	        ob.printArray(arr);
	    }
	}

	
	
	
	

