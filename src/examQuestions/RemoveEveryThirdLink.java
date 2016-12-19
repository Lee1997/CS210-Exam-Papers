package examQuestions;

import java.util.LinkedList;

public class RemoveEveryThirdLink {
	public static void main(String[] args) {
		RemoveEveryThirdLink retl = new RemoveEveryThirdLink();
	}
	
	public RemoveEveryThirdLink(){
		
		LinkedList ll = new LinkedList();
		
		ll.add("0");
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		ll.add("5");
		ll.add("6");
		ll.add("7");
		ll.add("8");
		ll.add("9");
		ll.add("10");
		
		int size = ll.size() / 3;
		
		System.out.println("Size before: " + ll.size());
		
		for(int i = 0; i < ll.size(); i++){
			System.out.print(ll.get(i) + " ");
		}		
		
		for(int i = ll.size()-1; i >= 0; i--)
			if((i+1)%3 == 0)
				ll.remove(i);
		
		System.out.println("\nSize after: " + ll.size());
		
		for(int i = 0; i < ll.size(); i++){
			System.out.print(ll.get(i) + " ");
		}
		
		
		
	}
	
	
}
