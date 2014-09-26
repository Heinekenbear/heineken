public class MaximumProductSubarray{
	public void maximumProductSubarray(int[] A){
		int len = A.length;
		if(len == 1)
			return A[0];
		int max = 0, min = 0, result = Integer.MIN_VALUE;
		for(int i: A){
			if(i > 0){
				max = Math.max(max * i, i);
				min = min * i;
			}
			else if(i == 0){
				max = 0; 
				min = 0;
			}
			else{
				int temp = max;
				max = min * i;
				min = Math.min(temp * i, i);
			}
			result = Math.max(max,result);
		}
		return result;
	}
}