package algorithms;

public class Search {

	public static  int linearSearch(int[] dataSet, int target) {
		for (int i=0; i<dataSet.length; i++) {
			if (dataSet[i] == target) {
			 return i;
			}
		}
	return -1;
	}

	public static int binarySearch(int []dataset, int target, int start, int end) {
		//binary search assume sorted array and therefore continually split our search domain in half.
	//	System.out.println("");
	//	int value = dataset[midpoint];
		
		if (end >=1) {
			int midpoint = start + (end-start)/2;

			if (dataset[midpoint] == target) 
				return midpoint;
			
			if (dataset[midpoint] > target) 
				return binarySearch(dataset,target,start,midpoint-1);
			
			else return binarySearch(dataset,target,midpoint+1,end);
			}
		return -1;

	}

}