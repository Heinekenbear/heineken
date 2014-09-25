public class QuickSort{
	public void quickSort(int[] arr, int low, int high){
		if(low < high){
			int key = partition(arr, low, high);
			quickSort(arr, low, key - 1);
			quickSort(arr, key + 1, low);
		}
	}
	public int partition(int[] arr, int low, int high){
		int key = arr[low];
		while(low < high){
			while(low < high && arr[high] >= key)
				high--;
			arr[low] = arr[high];
			while(low < high && arr[low] <= key)
				low++;
			arr[low] = arr[high];
		}
		arr[low] = key;
		return low;
	}
}