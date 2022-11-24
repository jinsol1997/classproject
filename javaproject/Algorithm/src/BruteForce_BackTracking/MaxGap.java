package BruteForce_BackTracking;

public class MaxGap {
	

	static int[] arr = {8, 20, 1, 15, 4, 10};
	static int[] test1 = {8, 20, 1, 15, 4, 10};

	
	// n은 array의 길이
	int answer(int n, int[] array) {
		
		int[] result = new int[n];

		double temp = 0;
		for(int i : array) {
			temp += array[i];
		}
		
		temp /= n;
		
		int temp1 = 200;
		int temp2 = 200;
		
		for(int i : array) {
			if(temp - array[i] < temp1 ){
				temp1 = array[i];
			}
		}
		
		for(int i : array) {
			if(temp - array[i] < temp2 && array[i] != temp1) {
				temp2 = array[i];
			}
		}
		
		
		
		
		return 1;
	}
	
	public static void main(String[] args) {
		
		int test = 0;
		for(int i=0; i<test1.length; i++) {
			test += test1[i];
		}
		System.out.println(test);
		
		System.out.println((20+15+10+8+4+1)/6);
	}

}
