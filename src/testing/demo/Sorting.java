package testing.demo;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		Integer[] arr = { 1,2,3,4,8,5,9,6,7};
//		bubbleSort(arr);
		bubbleSort2(arr);
	}

	static void bubbleSort(Integer[] arr) {
		boolean swap = true;
		 while (swap) {
			swap = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap = true;
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
		}
		 System.out.println("Sorted by bubbleSort1-------> "+Arrays.asList(arr));
	}
	
	static void bubbleSort2(Integer[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println("Sorted by bubbleSort2-------> "+Arrays.asList(arr));
	}

}
