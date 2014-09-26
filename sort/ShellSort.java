public class ShellSort{
	public void shellSort(int[] arr){
		int[] step = {5,3,1};
		for(int i: step){
			insertSort(arr,i);
		}
	}
	public void insertSort(int[] arr, int step){
		int len = arr.length;
		for(int i = step; i < len; i++){
			int value = arr[i];
			int j = i - step;
			while(j >= 0 && arr[j] > value){
				arr[j+step] = arr[j];
				j -= step;
			}
			arr[j+step] = value;
		}
	}
}