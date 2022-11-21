package testing.demo;

import java.util.Arrays;

public class Seraching {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int val = 3;

		int binarySearch2 = Arrays.binarySearch(arr, val);

		System.out.println(binarySearch2);

		 System.out.println(1>>>1);

		int binarySearch = binarySearch(arr, val);

		System.out.println("value is in " + binarySearch + " index");
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
}
