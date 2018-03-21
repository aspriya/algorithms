import java.util.*;

public class ArrayList1{
	public static void main(String[] args){
		ArrayList<Integer> arlst1 = new ArrayList<Integer>();
		arlst1.add(1);
		arlst1.add(2);
		arlst1.add(3);
		arlst1.add(1);
		arlst1.add(4);

		Iterator itr = arlst1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}