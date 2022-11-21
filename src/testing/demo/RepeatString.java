package testing.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatString {
	
	public static void main(String args[]){
		
		repeatString();
	}
	
	static void repeatString(){
		
		List<String> l1=new ArrayList<>();
		
		String[] str1 = {"1","2","3","4","5","6","7","8"};
		String[] str2 = {"1","9","3","10","5","11","7","12"};
		
		HashSet<String> hs = new HashSet<String>();
		
		for(String st1:str1){
			hs.add(st1);
		}
		
		for(String st2:str2){
			
			if(hs.contains(st2)){
				l1.add(st2);
			}
			hs.add(st2);
		}
		System.out.println(l1);
		System.out.println(hs);
		
	}

}
