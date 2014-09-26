public class InsertSort{
	public void insertSort(int[] arr){
		int len = arr.length;
		for(int i = 1; i < len; i++){
			int value = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > value){
				j--;
				a[j+1] = a[j];
			}
			a[j+1] = value;
		}
	}
}