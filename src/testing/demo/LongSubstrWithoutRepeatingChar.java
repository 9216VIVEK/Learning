package testing.demo;

import java.util.Arrays;

public class LongSubstrWithoutRepeatingChar {

	public static void main(String[] args) {
		int[] i = {1,2};
		int[] i1 = {3,4};
		System.out.println(findMedianSortedArrays(i,i1));
	}
	
	 static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 
		 int[] sum = new int[nums1.length+nums2.length];
		 
		 double median = 0;
		 
		 System.arraycopy(nums1, 0, sum, 0, nums1.length);
		 
		 System.arraycopy(nums2, 0, sum, nums1.length, nums2.length);
		 
		Arrays.sort(sum);
		 if(sum.length%2==0){
			 median = (double)(sum[sum.length/2] + sum[sum.length/2-1])/2;
		 }else{
			 median = sum[sum.length/2];
		 }
		 return median;
	    }
}
