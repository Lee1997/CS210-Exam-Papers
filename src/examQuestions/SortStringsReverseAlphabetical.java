package examQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringsReverseAlphabetical {
	
	public static void main(String[] args) {
		System.out.println(((4|6)|(5&3))<<5);

		SortStringsReverseAlphabetical ssra = new SortStringsReverseAlphabetical();	
	}
	
	public SortStringsReverseAlphabetical(){
		
		Scanner ui = new Scanner(System.in);
		int n = ui.nextInt();
		String[] stringArray = new String[n];
		ui.nextLine();
		//Fill array
		for(int i = 0; i < n; i++)
			stringArray[i] = ui.next();
		
		Arrays.sort(stringArray);
		String answerArray[] = new String[n];
		
		for(int i = 0, j = n-1; i < n; i++, j--){
			answerArray[i] = stringArray[j];
		}
		
		//Print Array
		for(String s : answerArray)
			System.out.print(s + " ");
		
	}
	
}
