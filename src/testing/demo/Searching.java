package testing.demo;

import java.util.Arrays;

public class Searching {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		Integer val = 18;

		int binarySearch2 = Arrays.binarySearch(arr, val);

		System.out.println("Avalable binary Search method----> "+binarySearch2);

		System.out.println("Created binary Search method----> "+binarySearch(arr,val));
		
		System.out.println("Created Recursive binary Search method----> "+binarySearchRecursion(arr,val,0,arr.length - 1));
	}

	public static int binarySearch(int[] arr, int val) {
		int first = 0;
		int last = arr.length - 1;
		int mid = 0;

		int midVal = arr[mid];

		while (first <= last) {

			mid = (first + last) >>> 1;
			midVal = arr[mid];
			if (midVal == val) {
				return mid;
			}
			if (midVal < val) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		return -1;
	}
	
	public static int binarySearchRecursion(int[] arr, int val,int first, int last) {
		int mid = 0;

		int midVal = arr[mid];

		while (first <= last) {

			mid = (first + last) >>> 1;
			midVal = arr[mid];
			if (midVal == val) {
				return mid;
			}
			if (midVal < val) {
				return binarySearchRecursion(arr,val,(mid + 1),last);
			} else {
				return binarySearchRecursion(arr,val,first,(mid - 1));
			}
		}
		return -1;
	}
}
