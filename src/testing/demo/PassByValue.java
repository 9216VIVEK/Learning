package testing.demo;

import java.util.Arrays;
import java.util.List;

public class PassByValue {
	
	public static void main(String[] args) {
		String name = "Vivek";
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		int primitive = 25;
		List<String> list = Arrays.asList("Vivek","Himanhus","Rohit","Rohan","Akash","Suraj","Sunil","Abhishek");
		
		passString(name);
		System.out.println(name);
		System.out.println();
		
		passArr(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		passByPrimitive(primitive);
		System.out.println(primitive);
		System.out.println();
		
		passByList(list);
		System.out.println(list);
		System.out.println();
		
	}
	
	static void passArr(int ...arr1) {
//		arr1 = new int[]{5,6,7,8,9,0};
		arr1[0] = 10;
		System.out.println(Arrays.toString(arr1));
	}
	
	static void passString(String name) {
		name = "Himanshu";
		System.out.println(name);
	}
	
	static void passByPrimitive(int primitive) {
		primitive +=1; 
		System.out.println(primitive);
	}
	
	static void passByList(List<String> list) {
		list.set(2, "Amit");
		System.out.println(list);
	}
}
