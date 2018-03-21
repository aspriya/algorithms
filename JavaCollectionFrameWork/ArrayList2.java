/*
There are two ways to traverse collection elements:
	By Iterator interface.
	By for-each loop.
*/

import java.util.*;

public class ArrayList2{
	public static void main(String[] args){
		ArrayList<String> arls2 = new ArrayList<String>();
		arls2.add("Ashan");
		arls2.add("Sripali");
		arls2.add("Priyadarshana");
		arls2.add("Wickramasinghe");

		for(String obj:arls2)   //for each loop
			System.out.println(obj);
	}
}