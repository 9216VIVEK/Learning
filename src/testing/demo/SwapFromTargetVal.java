package testing.demo;

public class SwapFromTargetVal {


	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,16,15,14,13,12,11,10,9};
		ansumer(arr, 16);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		
	}
	static void ansumer(int[] arr,int target) {
		int len = arr.length-1;
		for(int i=0;i<=len;i++) {
			if(arr[i]==target) {
				int dec = 0,tmp=0;
				for(int j=i;j<=len-dec;j++,dec++) {
					tmp = arr[j];
					arr[j] = arr[len-dec];
					arr[len-dec] = tmp;
				}
			}
		}
		
	}
}
