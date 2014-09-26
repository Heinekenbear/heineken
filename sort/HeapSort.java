import java.util.ArrayList;

public class HeapSort {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public HeapSort(){
		
	}
	
	public HeapSort(int[] arr){
		for(int i: arr){
			add(i);
		}
	}
	
	public void add(Integer i){
        list.add(i);
        int currentIndex = list.size()-1;
        while(currentIndex > 0){
             int parentIndex = (currentIndex - 1) / 2;
             if(list.get(currentIndex) > list.get(parentIndex)){
                  int temp = list.get(currentIndex);
                  list.set(currentIndex, list.get(parentIndex));
                  list.set(parentIndex, temp);
                  currentIndex = parentIndex;
             }
             else
                  break;
        }

	}
	public int remove(){
        int result= list.get(0);
        list.set(0, list.get(list.size()-1));
        list.remove(list.size()-1);
        int currentIndex = 0;
        while(currentIndex < list.size()){
             int leftIndex = currentIndex * 2 + 1;
             int rightIndex = currentIndex * 2 + 2;
             if(leftIndex >= list.size()) break;
             int maxIndex = leftIndex;
             if(rightIndex < list.size()){
                  if(list.get(rightIndex) > list.get(maxIndex))
                       maxIndex = rightIndex;
             }
             if(list.get(currentIndex) < list.get(maxIndex)){
                  int temp = list.get(currentIndex);
                  list.set(currentIndex, list.get(maxIndex));
                  list.set(maxIndex, temp);
                  currentIndex = maxIndex;
             }
             else
                  break;
        }
        return result;

	}
}