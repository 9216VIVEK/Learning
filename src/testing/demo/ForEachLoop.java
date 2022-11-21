package testing.demo;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {

		forEachLoop();
	}
	static void forEachLoop() {
			List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
			asList.forEach((i)->System.out.print(i));
		}
}

