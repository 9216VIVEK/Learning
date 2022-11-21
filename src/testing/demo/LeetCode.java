package testing.demo;

import java.util.Arrays;

public class LeetCode {

	public static void main(String[] args) {
		System.out.println(new LeetCode().lengthOfLongestSubstring(new int[]{9,9,6}));
	}
	
	 public int[] lengthOfLongestSubstring(int[] digits) {
		 for (int i = digits.length-1; i >=0 ; i--) {
			if(digits[i]<9){
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		 digits = new int[digits.length+1];
		 digits[0]=1;
		 return digits;
    }
}
