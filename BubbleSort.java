public class BubbleSort implements SortingAlgorithm{

	void swap(int[] array, int first, int second){
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}

	public void sort(int[] array){
		boolean swapped = true;                       // Check if the array is sorted or not, if it is not sorted then sort it.
		while(swapped){
			swapped = false;
			for (int i = 0; i < array.length-1; i++){
				if ( array[i] > array[i+1]){
					swap(array,i,i+1);
					swapped = true;
				}
			}
		}
	}
}