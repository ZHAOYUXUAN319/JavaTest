package TextBook;

public class Matome {

	public int[] bubbleSort(int[] loop) {
		for (int i = 0; i < loop.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < loop.length; j++) {
				if (loop[j] < loop[index]){
					index = j;
				}
			}
			int temp = loop[index];
			loop[index] = loop[i];	
			loop[i] = temp;
		}
	    return loop;
	}

}
