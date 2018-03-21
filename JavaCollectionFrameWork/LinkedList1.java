import java.util.*;
public class LinkedList1{
	public static void main(String[] args){
		LinkedList<String> lnlst = new LinkedList<String>();
		lnlst.add("Ashan");
		lnlst.add("Sripali");
		lnlst.add("Priyadarshana");
		lnlst.add("Wickramasinghe");

		Iterator itr = lnlst.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}