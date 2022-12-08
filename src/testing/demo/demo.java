package testing.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class demo {


	public static void main(String[] args) {
		String[] arr = {"nap", "teachers", "cheaters", "PAN", "ear", "era", "hectares"};
		Map<String,String> map= new HashMap<String,String>();
		for(int i=0;i<arr.length;i++){
			char[] key=arr[i].toLowerCase().toCharArray();
			Arrays.sort(key);
			map.put(new String(key), arr[i]);
		}
		System.out.println(map.values());
	}
}
