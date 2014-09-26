public class MergeSort {
	public void mergeSort(int[] arr){
		int len = arr.length;
		if(len > 1){
			int firstHalf = len / 2;
			int[] first = new int[firstHalf];
			System.arraycopy(arr, 0, first, 0, firstHalf);
			mergeSort(first);
			int secondHalf = len - firstHalf;
			int[] second = new int[secondHalf];
			System.arraycopy(arr, firstHalf, second, 0, secondHalf);
			mergeSort(second);
			merge(first, second, arr);
		}
	}
	public void merge(int[] first, int[] second, int[] arr){
		int index1 = 0, index2 = 0, index3 = 0;
		while(index1 < first.length && index2 < second.length){
			if(first[index1] < second[index2])
				arr[index3++] = first[index1++];
			else
				arr[index3++] = second[index2++];
		}
		while(index1 < first.length)
			arr[index3++] = first[index1++];
		while(index2 < second.length)
			arr[index3++] = second[index2++];
	}
}