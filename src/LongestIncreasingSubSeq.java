public class LongestIncreasingSubSeq {

	public static void main(String[] args) {
		
		int[] arr = {3,4,-1,0,6,2,3};
		
		System.out.println(findLongestSeq(arr));
	}

	private static final int findLongestSeq(int[] arr) {

		int[] result = initialize(arr.length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i;) {
				if (arr[j] < arr[i]) {
					result[i] = result[j] + 1;
				}
				j++;
			}
		}

		return min(result);

	}

	private static final int min(int[] results) {

		int max = Integer.MIN_VALUE;
		
		for(int i: results){
			if( i> max ){
				max = i;
			}
		}
		
		return max;
				
		
	}

	private static final int[] initialize(int size) {

		final int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1;
		}

		return arr;
	}

}
