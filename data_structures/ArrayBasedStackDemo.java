/*
LIFO
methods - push(e), pop(), peek()/top(), size(), isEmpty()
A variable called top to keep the index of top ellement. it starts from -1. 
when variable top = -1, stack is empty.
*/

class StackX{
	private int top;
	private double[] stackArray;
	private int capacity;  //size of array

	public StackX(int s){
		top = -1;
		capacity = s;
		stackArray = new double[capacity];
	}

	public void push(double v){
		if(top < capacity){
			stackArray[++top] = v;
		}
	}

	public double pop(){
		if(top > -1)
			return stackArray[top--];
		else
			return -1;

	}

	public boolean isEmpty(){
		if(top == -1)
			return true;
		else
			return false;
	}

	public double peek(){
		if(!isEmpty())
			return stackArray[top];
		else
			return -1;
	}

}

public class ArrayBasedStackDemo{
	public static void main(String[] args){
		StackX stack = new StackX(10);
		for(int i = 0; i < 10; i ++){
			stack.push(i);
		}

		System.out.println(stack.pop());
	}
}