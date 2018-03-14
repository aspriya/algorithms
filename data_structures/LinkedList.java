import java.util.Scanner;

class Node{
	int data;
	Node next;

	public Node(int data){
		this.data = data;
	}
}

public class LinkedList{
	Node head;

	public void append(int data){
		if(head == null){
			head = new Node(data);
			return;
		}

		Node current = head;

		while(current.next != null){
			current = current.next;
		}
		current.next = new Node(data);
	}

	public void prepend(int data){
		if(head==null){
			head = new Node(data);
			return;
		}

		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}

	public void deleteWithValue(int data){
		if(head == null)
			return;

		if(head.data == data){
			head = head.next;
			return;
		}

		Node current = head;
		while(current.next != null){
			if(current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	public static void main(String args[]){
		LinkedList ls = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int num;

		for(int i = 0 ; i < 10 ; i++){
			System.out.println("enter a number : ");
			num = sc.nextInt();
			ls.append(num);
		}

	}
}