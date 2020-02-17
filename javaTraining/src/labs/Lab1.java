package labs;

public class Lab1 {
	public static void main (String[] args ) {
		sum(5);
		System.out.println("factorial: " + fact(5));

		int[] numbers = {5,4,3,6,7,3};
		System.out.println("min : "+ findMin(numbers));
		System.out.println("max: " + findMax(numbers));
		System.out.println("avg: " + findAvg(numbers));

	}

	public static double findAvg(int[] arr) {
		double sum = 0;
				for (int i=0; i< arr.length; i++) {
					sum=sum+arr[i];					
				}
	return sum/arr.length;
					}

	
	
	public static int findMax(int[] arr) {
		int max = arr[0];
				for (int i=0; i< arr.length; i++) {
					if (arr[i]> max) {
						max= arr[i];
					}
				}
				return max;
	}
	
	
	
	public static int findMin(int[] arr) {
		int min = arr[0];
				for (int i=0; i< arr.length; i++) {
					if (arr[i]< min) {
						min = arr[i];
					}
				}
				return min;
	}
	
	
	
	// sum all numbers from 1 to n
	public static int sum(int n) {
		int sum= 0;
		for (int i = 1; i <=n; i++) {
			System.out.print(sum + " + " + i);
			sum = sum+i;
			System.out.println (" = " + sum);
				}
		return sum;
		}

	//factorial recursive 
	public static int fact(int n) {
		if (n==0) {
			return 1;
		}
		return fact(n-1)*n;
	}


	
}



