package examQuestions;

import java.util.Scanner;

public class Prime10001 {
	public static void main(String[] args) {
		Prime10001 p10001 = new Prime10001();
	}
	
	//104743 is the 10001st prime number
	
	public Prime10001(){
		
		int count = 1;
		long counter = 3;
		
		while(true){
			if(count == 10001)
				break;
			else if(isPrime(counter))
				count++;
			counter++;	
		}
		System.out.println(counter-1);
	}
	
	private boolean isPrime(long check) {
		
		for(int i = 2; i < Math.sqrt(check)+1; i++)
			if( check % i == 0)
				return false;
		
		return true;	
	}
}
