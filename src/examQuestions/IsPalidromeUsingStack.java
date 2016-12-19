package examQuestions;

import java.util.Scanner;

public class IsPalidromeUsingStack {
	
	public static void main(String[] args) {
		IsPalidromeUsingStack ipus = new IsPalidromeUsingStack();
	}
	
	public IsPalidromeUsingStack(){
		
		Scanner ui = new Scanner(System.in);
		String check = ui.nextLine();
		
		
		CStack cs = new CStack(check.length());
		
		//Fill Stack with string
		for(int i = 0; i < check.length(); i++){
			if(check.charAt(i) == ' '){
				check = check.substring(0, i) + check.substring(i+1, check.length());
				i--;
			}
			else
				cs.push(check.charAt(i));
		}
		boolean pali = true;
		
		for(int i = 0; i < check.length(); i++){
			if(check.charAt(i) != cs.pop())
				pali = false;
		}
		
		System.out.println(pali);
		
		
		
	}
	
}
