public class MaximumSubarray{
	public int maximumSubarray(int[] arr){
		int sum = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i: arr){
			if(sum < 0)
				sum = i;
			else
				sum += i;
			if(sum > max)
				max = sum;
		}
		return max;
	}
}