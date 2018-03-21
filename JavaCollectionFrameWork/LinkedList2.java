import java.util.*;

public class LinkedList2{
	public static void main(String){
		LinkedList<String> lnlst = new LinkedList<String>();
		lnlst.add("Ashan");
		lnlst.add("Sripali");
		lnlst.add("Priyadarshana");
		lnlst.add("Wickramasinghe");

		for(String obj: lnlst){
			System.out.println(obj);
		}
	}
}