package examQuestions;

import java.util.Scanner;

public class NearestPrime {
	public static void main(String[] args) {
		
		NearestPrime np = new NearestPrime();
		
		
	}
	
	public NearestPrime(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(findNearestPrime(num));
	}
	
	private int findNearestPrime(int num) {
		
		if(isPrime(num))
			return num;
		
		else{
			
			//Prime above
			int upper = num;
			while(!isPrime(upper))
				upper++;
			
			//Prime below
			int lower = num;
			while(!isPrime(lower))
				lower--;
			
			return (upper-num) > Math.abs(lower-num) ? lower : upper;
		}
		
	}

	private boolean isPrime(int check) {
		
		for(int i = 2; i < check; i++)
			if( check % i == 0)
				return false;
		
		return true;	
	}
}
