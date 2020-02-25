package algorithms;

public class Sort {

	public static void bubbleSort(int[] dataset) {
		boolean swapped = false;
		int j=1;
		int count=0;
		System.out.println("original array");
		printArr(dataset);
		do {
			swapped = false;
			for(int i =0; i< dataset.length-j; i++) {
				count = count+1;
				System.out.println(count +" comparisons");
				if (dataset[i]>dataset[i+1]) {
					int temp = dataset[i];
					dataset[i]=dataset[i+1];
					dataset[i+1]=temp;
					printArr(dataset);
					swapped=true;
				}
			}
			j++;
		} while (swapped);
		
	}
	
	private static void printArr(int[] arr) {
		for (int i:arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
}
