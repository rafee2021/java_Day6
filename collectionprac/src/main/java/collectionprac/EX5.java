package collectionprac;

import java.util.*;

public class EX5 {
	
	public static void myTree() {
		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(7);
		treeSet.add(4);
		treeSet.add(2);
		treeSet.add(9);
		
		System.out.println(treeSet);
		/*
		Iterator itr = treeSet.iterator();
		while(itr.hasNext()) {
			if(itr.next() < 7) {
				
			}
		}*/
			
	}
	
	
}
