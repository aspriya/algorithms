import java.util.Scanner;

class Node{
  Node left, right;
  int data;

  public Node(int data){
    this.data = data;
  }

  public void insert(int value){
    if(value <= data){
      if(left == null)
        left = new Node(value);
      else
        left.insert(value);
    }else{
      if(right == null)
        right = new Node(value);
      else
        right.insert(value);
    }
  }

  public boolean contains(int value){
    if(data == value)
      return true;
    else if(value <= data){
      if(left == null)
        return false;
      else
        return left.contains(value);
    }
    else if(value > data){
      if(right == null)
        return false;
      else
        return right.contains(value);
    }else{
      return false;
    }
  }

  public void printInOrder(){
    if(left != null)
      left.printInOrder();

    System.out.println(data);

    if(right != null)
      right.printInOrder();
  }

  public int findMax(){
    if(right == null)
      return data;
    else
      return right.findMax();
  }

}

public class BinarySearchTreeDemo{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("first enter a value for root node");
    int root_val = sc.nextInt();

    Node root = new Node(root_val) ;
    System.out.println("root node created!");

    for(int i = 0; i < 10; i++){
      System.out.println("enter a number ");
      String input = sc.next();
      int num=Integer.parseInt(input);
      root.insert(num);
    }

    System.out.println("Maximum is : " + root.findMax());

  }
  
}