package testing.demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindUniqueAndDuplicateInLinkedList {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10,20,20,30,60,60,60,60,70);
		
		java.util.LinkedList<Integer> lList = new LinkedList<>();
		lList.addAll(asList);
		
		System.out.println(lList);
		findUnique(lList);
		
	}
	
	static void findUnique(LinkedList<Integer> lList) {
		LinkedList<Integer> lList2 = new LinkedList<>();
		LinkedList<Integer> duplicate = new LinkedList<>();
		
		for(Integer val : lList) {
			if(!lList2.contains(val)) {
				lList2.add(val);
			}else {
				if(!duplicate.contains(val)) {
					duplicate.add(val);
				}
			}
		}
				lList2.removeAll(duplicate);

		System.out.println("Original--------> "+lList);
		System.out.println("Unique--------> "+lList2);
		System.out.println("Duplicate--------> "+duplicate);
	}

}
