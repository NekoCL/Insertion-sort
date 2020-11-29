public class InsertionSort extends MySortAlg {
	//Method
	public int[] sort(int[] array) {
		int n = array.length;
		//Loop through elements
		for (int i = 1; i < n; i++) {
			int key = array[i];
				
			//Find position to insert from left
			int j = i-1;
			//Sort the array in reverse
			while (j >= 0 && array[j] < key) {
				//Move element to the right to make space for key
				array[j+1] = array[j];
				j--;
			}
			//Insert key
			array[j+1] = key;
		}
		return array;
	}
}