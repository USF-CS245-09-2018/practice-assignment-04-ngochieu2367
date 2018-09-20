public class SelectionSort implements SortingAlgorithm{

	void swap(int[] array, int first, int second){
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}

	public int find_min(int pos, int[] array){
		int min = pos;

		for(int k = pos + 1; k < array.length ;k++){
			if (array[k] < array[min])
				min = k;
		}
		return min;
	}
	
	public void sort(int[] array){
		for(int i = 0; i< array.length ; i++){
			swap(array,i,find_min(i,array));
		}
	}
}