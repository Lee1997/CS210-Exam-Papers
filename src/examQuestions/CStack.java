package examQuestions;

public class CStack {
	
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public CStack(int s){
		
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
		
	}
	
	public void push(char p){
		top++;
		stackArray[top] = p;
	}
	
	public char pop(){
		return stackArray[top--];
	}
	
	public char peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == maxSize-1;
	}
	
	public void makeEmpty(){
		top = -1;
	}
	
}
