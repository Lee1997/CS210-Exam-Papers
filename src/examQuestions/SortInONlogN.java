package examQuestions;

import java.util.Arrays;

public class SortInONlogN {
	public static void main(String[] args) {
		SortInONlogN sionln = new SortInONlogN();
	}
	
	public SortInONlogN(){
		
		String[] array = {"one", "two", "three", "four", "five"};
		
		//Sorts in O(nlog(n)) time
		Arrays.sort(array);
		
		for(String s: array)
			System.out.println(s);
		
	}
	
}
