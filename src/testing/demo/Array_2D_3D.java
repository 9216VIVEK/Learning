package testing.demo;

import java.util.Arrays;

public class Array_2D_3D {

	public static void main(String[] args) {
		
		int[] arr;            //Declarations in compile time(reference variable take memory in stack)
		arr = new int[5]; //initialization in runtime( object take memory in heap)
		
		int[] arr1 = {2,3,4,5,6}; //both in same line
		
//		array2D();
		array3D();
		
	}
	
	static void array2D() {
		
		//2D_Array
				int[][] Arr2D= {
						{1,2,3},
						{4,15,6},
						{7,8,9}
				};
				
				int max = 0;
				for(int [] ar : Arr2D) {
					System.out.println(Arrays.toString(ar));
					for(int ar1 : ar) {
						if(max<ar1) {
							max = ar1;
						}
					}
				}
				System.out.println("Max value present in 2DArray------>"+max);
	}

	static void array3D() {
		
		int[][][] arr3D = {
				
				{
					{1,2,3,},
					{4,5,6},
					{7,8,9}
				},
				{
					{10,54,12},
					{13,14,15},
					{16,17,18}
				},
				{
					{19,20,21},
					{22,23,24},
					{25,26,11}
				}
		}; 

		int max = 0;
		for (int[][] is : arr3D) {
			for (int[] is2 : is) {
				System.out.println(Arrays.toString(is2));
				for (int is3 : is2) {
					if(max<is3) {
						max = is3;
					}
				}
			}
		}
		System.out.println("Max value present in 3DArray------>"+max);
		swapTwoValuesIn3D(arr3D, 5,9);
	}
	
	static void swapTwoValuesIn3D(int[][][] arr3D,int val1,int val2) {
		int[] indexOfval1 = null;
		int[] indexOfval2 = null;
		int tmp;
		
		for (int i = 0; i < arr3D.length; i++) {
			for (int j = 0; j < arr3D[i].length; j++) {
				for (int k = 0; k < arr3D[i][j].length; k++) {
					if(arr3D[i][j][k]==val1) {
						indexOfval1 = new int[]{i,j,k};
					}else if(arr3D[i][j][k]==val2) {
						indexOfval2 = new int[]{i,j,k};
					}
				}
			}
		}
		if(indexOfval1==null) {
			System.err.println("val1 not exist in this 3D Array");
			return;
		}else if(indexOfval2==null) {
			System.err.println("val2 not exist in this 3D Array");
			return;
		}
		tmp = arr3D[indexOfval1[0]][indexOfval1[1]][indexOfval1[2]];
		arr3D[indexOfval1[0]][indexOfval1[1]][indexOfval1[2]] = arr3D[indexOfval2[0]][indexOfval2[1]][indexOfval2[2]];
		arr3D[indexOfval2[0]][indexOfval2[1]][indexOfval2[2]] = tmp;
		
		for (int[][] is : arr3D) {
			for (int[] is2 : is) {
				System.out.println(Arrays.toString(is2));
			}
		}
	}
	
}
